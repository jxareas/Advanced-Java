package com.jonareas.app;

import com.jonareas.repository.CustomerRepository;
import com.jonareas.repository.CustomerRepositoryImpl;
import com.jonareas.repository.VendorRepository;
import com.jonareas.repository.VendorRepositoryImpl;

public class Main {

    public static void main(String[] args) {
        VendorRepository vendorRepository = new VendorRepositoryImpl();
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        System.out.println(vendorRepository.findAll());
        System.out.println(customerRepository.findAll());
    }



}
