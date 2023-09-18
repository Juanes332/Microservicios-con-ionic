package com.example.demo.services;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository respository;

    @Override
    public List<Employee> getAll(){
        return (List<Employee>) respository.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return (Employee) respository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        respository.deleteById(id);
    }

    @Override
    public void save(Employee employee){
        respository.save(employee);
    }

}

