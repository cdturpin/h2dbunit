package com.aci.demo.h2dbunit.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class WebConfiguration {
	
	@Bean(destroyMethod = "")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setName("test")
				.setType(EmbeddedDatabaseType.H2) // .H2 or .DERBY
				.continueOnError(true)
				.ignoreFailedDrops(true)
				.addScripts("schema-h2.sql")
				.addScripts("data-h2.sql")
				.build();
		return db;
	}
	
//    @Bean
//    ServletRegistrationBean h2servletRegistration(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
//        registrationBean.addUrlMappings("/console/*");
//        return registrationBean;
//    }
}
