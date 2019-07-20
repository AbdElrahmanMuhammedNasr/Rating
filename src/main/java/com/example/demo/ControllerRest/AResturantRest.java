package com.example.demo.ControllerRest;

import com.example.demo.HServersInterface.AResturantServise;
import com.example.demo.Model.AResturant;
import com.example.demo.Model.BAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AResturantRest {
    @Autowired
    private AResturantServise aResturantServise;


    @GetMapping(value = {"/allRest"})
    public List<AResturant> getResurant(){
        return aResturantServise.findAllReaturant();
    }

    @GetMapping(value = {"/oneRest/{id}"})
    public AResturant getOneResurant(@PathVariable("id") Long id){
        return aResturantServise.findOneResturant(id);
    }

    @GetMapping(value = {"/saveData"})
    public void saveData(AResturant resturant){

         aResturantServise.saveOneRestureat(resturant);


    }

}
