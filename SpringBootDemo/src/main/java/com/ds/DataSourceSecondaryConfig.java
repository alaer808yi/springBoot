package com.ds;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataSourceSecondaryConfig {
	@Bean(name = "secondaryDS") 
	@Qualifier("secondaryDS")
	@ConfigurationProperties(prefix="custom.datasource")
	public DataSource secondaryDataSource(){
		return DataSourceBuilder.create().build();
	}

}
