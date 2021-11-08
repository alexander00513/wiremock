package com.example.wiremockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@AutoConfigureWireMock
@SpringBootApplication
public class WiremockAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WiremockAppApplication.class, args);
    }

}
