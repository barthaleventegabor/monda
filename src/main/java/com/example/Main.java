package com.example;

import java.util.ArrayList;

import com.example.models.Employee;
import com.example.models.EmployeeSource;
import com.example.models.Sqlite;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        ArrayList<Employee> empList = new EmployeeSource(new Sqlite()).index();
        empList.forEach((emp)->{
            System.out.println(emp.getName());
        });
    }
}