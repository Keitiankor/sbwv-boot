package com.example.springbootwithvue;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BootMain.class)
            .properties("spring.config.location=classpath:application.yml")
            .run(args);
    }
}
