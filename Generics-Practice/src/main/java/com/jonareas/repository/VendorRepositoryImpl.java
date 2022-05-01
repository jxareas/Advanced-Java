package com.jonareas.repository;

import com.jonareas.model.Vendor;

import java.util.List;

public class VendorRepositoryImpl implements VendorRepository {

    @Override
    public Vendor save(Vendor entity) {
        return new Vendor(1, "Xavier Areas");
    }

    @Override
    public Vendor update(Integer integer, Vendor entity) {
        return new Vendor(1, "Xavier Areas");
    }

    @Override
    public List<Vendor> findAll() {
        return List.of(new Vendor(1, "Xavier Areas"), new Vendor(2, "Xavi"));
    }

    @Override
    public Vendor findById(Integer integer) {
        return new Vendor(1, "Xavier Areas");
    }

    @Override
    public void deleteById(Integer integer) {
        // do nothing
    }
}
