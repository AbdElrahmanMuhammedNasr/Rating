package com.example.demo.HServersInterface;

import com.example.demo.Model.AResturant;

import java.util.List;

public interface AResturantServise {

    List<AResturant> findAllReaturant();

    void deleteById(Long id);
}
