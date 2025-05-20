package com.example.webservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = "com.example.webservice.model")
@EnableJpaRepositories(basePackages = "com.example.webservice.repository")
@EnableTransactionManagement
public class JpaConfig {
}