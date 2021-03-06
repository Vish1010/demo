package com.ajavahome.ecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "com.ajavahome.ecommerce")
@Configuration
@EnableAutoConfiguration
public class Application {
    public static void main (String args[]){
        SpringApplication.run(Application.class,args);
    }

}
