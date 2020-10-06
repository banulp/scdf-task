package com.banulp.toy.scdftask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class ScdfTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScdfTaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner myCLRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("Hello banulp scdf Task!!!!!");
            }
        };
    }

}
