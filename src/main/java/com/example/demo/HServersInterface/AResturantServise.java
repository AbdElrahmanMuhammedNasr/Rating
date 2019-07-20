package com.example.demo.HServersInterface;

import com.example.demo.Model.AResturant;

import java.util.List;

public interface AResturantServise {

    List<AResturant> findAllReaturant();

    AResturant findOneResturant(Long id);
    AResturant saveOneRestureat(AResturant aResturant);

    void deleteById(Long id);
}
