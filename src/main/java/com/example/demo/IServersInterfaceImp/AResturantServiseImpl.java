package com.example.demo.IServersInterfaceImp;

import com.example.demo.HServersInterface.AResturantServise;
import com.example.demo.KReposotiry.AresturantRepo;
import com.example.demo.Model.AResturant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AResturantServiseImpl implements AResturantServise {
    @Autowired
    private AresturantRepo aresturantRepo;


    @Override
    public List<AResturant> findAllReaturant() {

        return aresturantRepo.findAll();
       // return aresturantRepo.findAllAndis__delete(); //own function for softdelete
    }

    @Override
    public void deleteById(Long id) {
        aresturantRepo.deleteById(id);
    }
}
