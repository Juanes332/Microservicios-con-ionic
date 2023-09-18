package com.example.demo.services;

import com.example.demo.entities.Supplier;
import com.example.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierService implements ISupplierService{

    @Autowired
    private SupplierRepository respository;

    @Override
    public List<Supplier> getAll(){
        return (List<Supplier>) respository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier) respository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        respository.deleteById(id);
    }

    @Override
    public void save(Supplier supplier){
        respository.save(supplier);
    }

}

