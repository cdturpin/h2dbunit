package com.aci.demo.h2dbunit.config;

import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.aci.demo.h2dbunit.H2dbunitApplication;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "com.aci.demo")
@SpringBootTest(classes = { H2dbunitApplication.class, SecurityConfiguration.class, SpringRootConfig.class,	WebConfiguration.class })
@WebAppConfiguration
@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = { "classpath:createSchemas.sql",	"classpath:schema-h2.sql", "classpath:data-h2.sql" })
@Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:drop-schema.sql")
public class TestConfig {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Before
	public void setUp() {
		EmbeddedDatabase db = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
	              .addScript("createSchemas.sql")
	              .addScript("schema-h2.sql")
	              .addScript("data-h2.sql")
	              .build();
		
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(db);
	}

	@Test
	public void selectMPTStats() {
		String selectQuery = "SELECT * from ACSDBO.ACS_POS_MONTHLY_MPT_STATS WHERE ENTITY_ID = :value";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		int sqlType = paramSource.getSqlType("value");
		String typeName = paramSource.getTypeName("value");
		paramSource.addValue("value", "1020", sqlType, typeName);
		List<Map<String, Object>> resultSet = namedParameterJdbcTemplate.queryForList(selectQuery, paramSource);

		assertNotNull(resultSet);
		LinkedHashMap<String, Object> hashmap = createMap();
		List<Map<String, Object>> expected = new ArrayList<>();
		expected.add(hashmap);
		EqualsBuilder.reflectionEquals(expected, resultSet);
		
	}
	
	@SuppressWarnings("deprecation")
	private LinkedHashMap<String, Object> createMap() {
		LinkedHashMap<String, Object> hashmap = new LinkedHashMap<>();
		hashmap.put("ENTITY_ID","1020"); 
		hashmap.put("EFFECTIVE_DATE",new Date(117,00,31)); 
		hashmap.put("STAT_TYPE","NET"); 
		hashmap.put("ENTITY_BMRK_RELATION_TYPE","PRIMARY");
		hashmap.put("BMRK_ENTITY_ID",120653); 
		hashmap.put("SRC_INTFC_INST",4); 
		hashmap.put("ALPHA_1_YR_PCT",-1.923779005038); 
		hashmap.put("ALPHA_3_YR_PCT",-1.536175902993); 
		hashmap.put("ALPHA_5_YR_PCT",-2.042074500189); 
		hashmap.put("ALPHA_10_YR_PCT",-0.528195957600); 
		hashmap.put("ALPHA_ITD_PCT",null); 
		hashmap.put("BETA_1_YR_NBR",1.021488084729); 
		hashmap.put("BETA_3_YR_NBR",1.006141610009); 
		hashmap.put("BETA_5_YR_NBR",1.009059671846); 
		hashmap.put("BETA_10_YR_NBR",0.992567860944); 
		hashmap.put("BETA_ITD_NBR",null); 
		hashmap.put("INFO_RO_1_YR_NBR",-0.841629641442); 
		hashmap.put("INFO_RO_3_YR_NBR",-0.838020970858); 
		hashmap.put("INFO_RO_5_YR_NBR",-1.211195021342); 
		hashmap.put("INFO_RO_10_YR_NBR",-0.298758876080);
		hashmap.put("INFO_RO_ITD_NBR",null);
		hashmap.put("R2_1_YR_PCT",0.939943360209);
 		hashmap.put("R2_3_YR_PCT",0.969848636385);
		hashmap.put("R2_5_YR_PCT",0.972367985338);
		hashmap.put("R2_10_YR_PCT",0.980647176762);
		hashmap.put("R2_ITD_PCT",null); 
		hashmap.put("SHARPE_RO_1_YR_NBR",1.664758440109); 
		hashmap.put("SHARPE_RO_3_YR_NBR",0.802078926946); 
		hashmap.put("SHARPE_RO_5_YR_NBR",1.070138036788); 
		hashmap.put("SHARP_RO_10_YR_NBR",0.456484031753); 
		hashmap.put("SHARP_RO_ITD_NBR",null); 
		hashmap.put("STD_DEV_1_YR_PCT",9.047184420223); 
		hashmap.put("STD_DEV_3_YR_PCT",11.287767027873); 
		hashmap.put("STD_DEV_5_YR_PCT",10.875416023841); 
		hashmap.put("STD_DEV_10_YR_PCT",15.519101975419); 
		hashmap.put("STD_DEV_ITD_PCT",22.152144306285); 
		hashmap.put("TRACKING_1_YR_PCT",2.224808784361); 
		hashmap.put("TRACKING_3_YR_PCT",1.961198780968);
		hashmap.put("TRACKING_5_YR_PCT",1.810369642222); 
		hashmap.put("TRACKING_10_YR_PCT",2.161995565292); 
		hashmap.put("TRACKING_ITD_PCT",null); 
		hashmap.put("LAST_UPDATE_BY","MPSPACE"); 
		hashmap.put("LAST_UPDATE_TS",new Date(117,06,13)); 
		hashmap.put("STATUS_CD",'P');
		return hashmap;
	}

}
