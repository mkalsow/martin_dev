package com.martin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.martin")
@EnableAutoConfiguration(exclude = DataSourceTransactionManagerAutoConfiguration.class)
public class MartinDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(MartinDevApplication.class, args);
    }
 
}

