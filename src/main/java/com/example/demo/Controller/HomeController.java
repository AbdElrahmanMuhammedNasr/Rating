package com.example.demo.Controller;

import com.example.demo.ControllerRest.AResturantRest;
import com.example.demo.HServersInterface.AResturantServise;
import com.example.demo.HServersInterface.DofferServise;
import com.example.demo.Model.AResturant;
import com.example.demo.KReposotiry.AresturantRepo;
import com.example.demo.Model.DOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private AResturantRest aResturantRest;

    @Autowired
    private DofferServise dofferServise;


    @GetMapping(value = {"/"})
    public String getformPage(){
        return "WebPages/formPage";
    }

    @PostMapping(value = {"/saveRest"})
    public String saveRest(){

        return "WebPages/formPage";
    }


    @GetMapping(value = {"/allResturent"})
    public String getResurant(Model model){
        model.addAttribute("AllRest",aResturantRest.getResurant());
        return "WebPages/Restrurant";
    }

    @GetMapping(value = {"/fullRestDetai"})
    public String getOffer(Model model){
        model.addAttribute("AllRest",aResturantRest.getResurant());
        return "WebPages/RestrurantFullDetails";
    }
    /*

    @GetMapping(value = "/delete")
    public  String delete(){
        aResturantServise.deleteById(1l);
        return "OK";
    }

*/

}

