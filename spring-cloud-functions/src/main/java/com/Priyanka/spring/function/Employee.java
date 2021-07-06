package com.Priyanka.spring.function;

public class Employee {
    private String empid;
    private String empname;
    private String empmail;

    public Employee(String s, String priya, String s1) {
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpmail() {
        return empmail;
    }

    public void setEmpmail(String empmail) {
        this.empmail = empmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", empname='" + empname + '\'' +
                ", empmail='" + empmail + '\'' +
                '}';
    }

}
