package com.jonareas.repository;

import com.jonareas.model.Customer;

import java.util.List;

public interface CRUD<T, ID> {

     T save(T entity);

    T update(ID id, T entity);

    List<T> findAll();

    T findById(ID id);

    void deleteById(ID id);


}
