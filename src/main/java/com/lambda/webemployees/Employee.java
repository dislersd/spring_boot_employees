package com.lambda.webemployees;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {

    private static final AtomicLong counter = new AtomicLong(); // When two people try to sign up at same time atomiclong makes sure they both get a different id
    private long id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401k;
    private long companyId;
    private long healthplanId;

    public Employee(String fname, String lname, double salary, boolean has401k, long companyId, long healthplanId) {
        this.id = counter.incrementAndGet();
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthplanId = healthplanId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHas401k() {
        return has401k;
    }

    public void setHas401k(boolean has401k) {
        this.has401k = has401k;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public long getHealthplanId() {
        return healthplanId;
    }

    public void setHealthplanId(long healthplanId) {
        this.healthplanId = healthplanId;
    }

    public String getName() {
        return fname + " " + lname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                ", has401k=" + has401k +
                ", companyId=" + companyId +
                ", healthplanId=" + healthplanId +
                '}';
    }
}
