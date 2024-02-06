package com.example.demo.service;

import java.util.List;

public interface BaseService <D>{

    D save (D d);
    List<D> findAll();
    D findById(Long id);
    D update(D d);
}
