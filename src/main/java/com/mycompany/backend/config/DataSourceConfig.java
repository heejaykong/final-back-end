package com.mycompany.backend.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Configuration
public class DataSourceConfig {
  @Bean
  public DataSource dataSource() {
    log.info("실행");
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("org.mariadb.jdbc.Driver");
    config.setJdbcUrl("jdbc:mariadb://localhost:3306/DB");
    config.setUsername("root");
    config.setPassword("mariadb");
    config.setMaximumPoolSize(3);
    HikariDataSource hikariDataSource = new HikariDataSource(config);
    return hikariDataSource;
  }
}
