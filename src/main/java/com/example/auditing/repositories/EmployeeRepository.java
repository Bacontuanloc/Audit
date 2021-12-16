package com.example.auditing.repositories;


import com.example.auditing.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}