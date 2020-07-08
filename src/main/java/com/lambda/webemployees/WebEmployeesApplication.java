package com.lambda.webemployees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebEmployeesApplication {
    public static EmpList ourEmpList;

    // main method
    public static void main(String[] args) {

        ourEmpList = new EmpList();
        SpringApplication.run(WebEmployeesApplication.class, args);
    }

}