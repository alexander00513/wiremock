package com.example.wiremockapp.config;

import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import org.springframework.cloud.contract.wiremock.WireMockConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wiremock.webhooks.Webhooks;

@Configuration
public class WireMockExtensionsConfig {

    @Bean
    public WireMockConfigurationCustomizer optionsCustomizer() {
        return options -> options.extensions(new Webhooks(), new ResponseTemplateTransformer(true));
    }
}
