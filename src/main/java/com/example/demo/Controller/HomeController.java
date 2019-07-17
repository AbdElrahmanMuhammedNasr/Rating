package com.example.demo.Controller;

import com.example.demo.Model.AResturant;
import com.example.demo.KReposotiry.AresturantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private AresturantRepo aresturantRepo;

    @GetMapping(value = {"/"})
    public List<AResturant> getPage(){

        return aresturantRepo.findAll();
    }
}
