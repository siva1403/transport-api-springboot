package com.transfort.management.transport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration  // Marks this class as a configuration class
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

  @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOriginPatterns("*").allowCredentials(true)
                        .allowedMethods("*").allowedHeaders("*");
            }
        };
    }
}
