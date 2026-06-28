
package com.shri;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shri.entity.Address;
import com.shri.entity.Employee;
import com.shri.repo.AddRepo;
import com.shri.repo.EmpRepo;

;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmpRepo empRepo;
    @Autowired
    private AddRepo addRepo;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("shrinandan");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("raghunandan kumar");

        Address address = new Address();
        address.setId(1);
        address.setVillage("thikahan basudevan");

        employee.setAddress(address);
        employee1.setAddress(address);

        List<Employee> emp = new ArrayList<>();
        emp.add(employee);
        emp.add(employee1);

        address.setEmployees(emp);

        addRepo.save(address);

        System.out.println("Data Saved Successfully");
    }
}