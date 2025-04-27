package com.umcs.skni.mordappka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
////                registry.addMapping("/**") // dla wszystkich endpointów
////                        .allowedOrigins("http://localhost:3000") // frontend
////                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
////                        .allowedHeaders("*")
////                        .allowCredentials(true);
//                //zmienic kiedys do produkcji
//                    registry.addMapping("/**")
//                            .allowedOrigins("*")
//                            .allowedMethods("*")
//                            .allowedHeaders("*")
//                            .allowCredentials(false);
//            }
//        };

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://10.50.50.77:8080", "http://localhost:5173")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}