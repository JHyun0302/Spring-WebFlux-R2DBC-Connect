package com.example.webflux_r2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "com.example.webflux_r2dbc.connect.repository")
public class WebFluxR2DbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebFluxR2DbcApplication.class, args);
    }
}
