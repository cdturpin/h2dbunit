package com.aci.demo.h2dbunit.config;

import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.aci.demo.h2dbunit.loaders.CsvDataSetLoader;
import com.aci.demo.h2dbunit.model.Characteristic;
import com.aci.demo.h2dbunit.service.CharacteristicsService;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.github.springtestdbunit.annotation.ExpectedDatabase;

@ContextConfiguration
@SpringBootTest(classes = { TestConfig.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
public class DataSetTests {
	
	@Autowired
	private CharacteristicsService charService;

//	@Test
//	@DatabaseSetup
//	@ExpectedDatabase("/datasets/csv/acs_pos_monthly_char/expected_entityId1020andEffDate31Jan17.csv")
//	public void testFindAllChars() {
//		Collection<Characteristic> allChars = charService.find();
//		
//		assertNotNull(allChars);
//	}
}
