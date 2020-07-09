package com.lambda.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class EmployeeController {

    @GetMapping(value = "/allemployees", produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees() {
        WebEmployeesApplication.ourEmpList.empList.sort((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        return new ResponseEntity<>(WebEmployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }
}
