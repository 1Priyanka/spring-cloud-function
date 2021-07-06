package com.Priyanka.spring.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GetEmployeeData implements Supplier<EmployeeData> {

    @Override
    public EmployeeData get() {
        EmployeeData employeeData = new EmployeeData();
        employeeData.setEmployees(this.employees());
        return employeeData;

    }
    private List<Employee>employees(){
        return new ArrayList<>(){{
            add(new Employee("1","priya","priya@gmail.com"));
            add(new Employee("2","sarmi","sarmi@gmail.com"));
            add(new Employee("3","thinesh","thinesh@gmail.com"));
            add(new Employee("4","kuddy","kuddy@gmail.com"));


        }};
    }


}

