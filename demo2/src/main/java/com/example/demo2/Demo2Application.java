package com.example.demo2;

import com.example.demo2.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(UserService userService) {
//        return args -> {
//            userService.saveUser()
//        }
//    }

}
