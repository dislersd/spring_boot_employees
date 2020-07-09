package com.lambda.webemployees;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
    public List<Employee> empList = new ArrayList<>();

    public EmpList() {
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("Sam", "Ford", 80000, true, 1, 1));
        empList.add(new Employee("John", "Jones", 75000, true, 1, 1));
    }

    public Employee findEmployee(CheckEmployee tester) {
        for (Employee e : empList) {
            if (tester.test(e)) {
                return e;
            }
        }
        return null;
    }

    public List<Employee> findEmployees(CheckEmployee tester) {
        List<Employee> tempEmpList = new ArrayList<>();

        for (Employee e : empList) {
            if (tester.test(e)) {
                tempEmpList.add(e);
            }
        }
        return tempEmpList;
    }
}
