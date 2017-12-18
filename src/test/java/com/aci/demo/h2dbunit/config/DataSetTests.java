package com.aci.demo.h2dbunit.config;

import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.aci.demo.h2dbunit.domain.Characteristic;
import com.aci.demo.h2dbunit.loaders.CsvDataSetLoader;
import com.aci.demo.h2dbunit.service.CharacteristicsService;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.github.springtestdbunit.annotation.ExpectedDatabase;

@ContextConfiguration
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
public class DataSetTests {
	
	@Autowired
	private CharacteristicsService charService;

	@Test
	@DatabaseSetup("/datasets/csv/acs_pos_monthly_char/entityId120andEffDate31Jan17.csv")
	@ExpectedDatabase("/datasets/csv/acs_pos_monthly_char/expected_entityId120andEffDate31Jan17.csv")
	public void testGetChar() {
		String entityId = "1020";
		Collection<Characteristic> allChars = charService.findChar(entityId);
		for (Characteristic chara : allChars) {
			System.out.println(chara);
		}
		assertNotNull(allChars);
	}
}
