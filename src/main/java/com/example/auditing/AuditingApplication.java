package com.example.auditing;

import com.example.auditing.domain.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.auditing.domain.Employee;
import com.example.auditing.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AuditingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditingApplication.class, args);
    }

    @Bean
    public CommandLineRunner auditingDemo(EmployeeRepository employeeRepository) {
        return args -> {

            ArrayList<Employee> list= new ArrayList<>();
            Employee e= new Employee("Emp1","0987654321","emp1@gmail.com");
            Employee e1= new Employee("Emp2","0987654322","emp2@gmail.com");
            Employee e2= new Employee("Emp3","0987654323","emp3@gmail.com");
            list.add(e);
            list.add(e1);
            list.add(e2);
            //Save List
            employeeRepository.saveAll(list);
            //Get Employee
            Iterable<Employee> empList = employeeRepository.findAll();
            //Show Employee
            empList.forEach(System.out::println);
        };
    }

}
