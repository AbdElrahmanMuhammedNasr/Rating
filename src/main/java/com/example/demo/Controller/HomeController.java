package com.example.demo.Controller;

import com.example.demo.HServersInterface.AResturantServise;
import com.example.demo.HServersInterface.DofferServise;
import com.example.demo.Model.AResturant;
import com.example.demo.KReposotiry.AresturantRepo;
import com.example.demo.Model.DOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private AResturantServise aResturantServise;

    @Autowired
    private DofferServise dofferServise;

    @GetMapping(value = {"/"})
    public List<AResturant> getResurant(){
        return aResturantServise.findAllReaturant();
    }

    @GetMapping(value = {"/o"})
    public List<DOffer> getOffer(){
        return dofferServise.findAllOffer();
    }
}
