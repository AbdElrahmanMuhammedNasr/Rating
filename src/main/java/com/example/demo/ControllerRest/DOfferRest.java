package com.example.demo.ControllerRest;

import com.example.demo.HServersInterface.DofferServise;
import com.example.demo.Model.DOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DOfferRest {
    @Autowired
    private DofferServise dofferServise;

    @GetMapping(value = {"/saveOfferData"})
    public void saveData(DOffer offer){
        dofferServise.savaOfferData(offer);

    }
}
