package com.k003.lesson2;

import com.k003.lesson2.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {

        UserController mainController = new UserController();
        mainController.controller();

    }
}