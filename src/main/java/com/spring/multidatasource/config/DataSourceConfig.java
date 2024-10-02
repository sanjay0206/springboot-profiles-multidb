/*
package com.spring.multidatasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @Profile("dev")  // Use MySQL when the dev profile is active
    public DataSource devDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/flight_db_dev")
                .username("root")
                .password("java@2021")
                .build();
    }

    @Bean
    @Profile("uat")  // Use PostgreSQL for all profiles except dev
    public DataSource nonDevDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://localhost:5432/flight_db_uat")
                .username("postgres")
                .password("java#2021")
                .build();
    }
}
*/
