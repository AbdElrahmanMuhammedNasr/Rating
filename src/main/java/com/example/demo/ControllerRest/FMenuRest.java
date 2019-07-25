package com.example.demo.ControllerRest;

import com.example.demo.HServersInterface.FMenuServise;
import com.example.demo.Model.FMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FMenuRest {
    @Autowired
    private FMenuServise menuServise;

    @GetMapping(value = {"/saveMenuData"})
    public void saveData(FMenu menu){
        menuServise.SaveMenu(menu);

    }
}
