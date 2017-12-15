package com.aci.demo.h2dbunit;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {H2dbunitApplication.class, SpringRootConfig.class})
@WebAppConfiguration
//@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:schema-h2.sql","classpath:data-h2.sql"} )
//@Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:drop-schema.sql")
public class H2dbunitApplicationTests {
	
	String selectQuery = "SELECT * from :tableName WHERE :columnName = :value" ;
	
	String tableName = null;
	String columnName = null;
	String value = null;
	
	@Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void selectMPTStats() {
	
		String selectQuery = "SELECT * from :tableName WHERE :columnName = :value" ;

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(tableName,"ACS_POS_MONTHLY_MPT_STATS");
        paramSource.addValue(columnName,"ENTITY_ID");
        paramSource.addValue(value,"1021");
		List<Map<String, Object>> resultSet = namedParameterJdbcTemplate.queryForList(selectQuery, paramSource);

        System.out.println(resultSet);
	}

}
