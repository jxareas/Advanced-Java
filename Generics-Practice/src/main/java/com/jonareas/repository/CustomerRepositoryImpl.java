package com.jonareas.repository;

import com.jonareas.model.Customer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer save(Customer entity) {
        return new Customer(1, "Jon Areas");
    }

    @Override
    public Customer update(Integer integer, Customer entity) {
        return new Customer(2, "Jonny Areas");
    }

    @Override
    public List<Customer> findAll() {
        return List.of(new Customer(1, "Jon Areas"),
                new Customer(2, "Jonny Areas"));
    }

    @Override
    public Customer findById(Integer integer) {
        return new Customer(1, "Jon Areas");
    }

    @Override
    public void deleteById(Integer integer) {
        // do nothing
    }
}
