package com.pl.jwojcik.restfulapiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class RestfulApiAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulApiAppApplication.class, args);
    }
}
