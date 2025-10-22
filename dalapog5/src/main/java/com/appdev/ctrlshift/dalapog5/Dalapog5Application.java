package com.appdev.ctrlshift.dalapog5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.appdev.ctrlshift")
@EntityScan(basePackages = "com.appdev.ctrlshift.entity")
@EnableJpaRepositories(basePackages = "com.appdev.ctrlshift.repository")
public class Dalapog5Application {

    public static void main(String[] args) {
        SpringApplication.run(Dalapog5Application.class, args);
    }
}

