package com.example.demo.services;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository respository;

    @Override
    public List<Customer> getAll(){
       return (List<Customer>) respository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return (Customer) respository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        respository.deleteById(id);
    }

    @Override
    public void save(Customer customer){
        respository.save(customer);
    }

}
