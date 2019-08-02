package com.example.demo.Controller;

import com.example.demo.ControllerRest.AResturantRest;
import com.example.demo.ControllerRest.DOfferRest;
import com.example.demo.ControllerRest.FMenuRest;
import com.example.demo.HServersInterface.AResturantServise;
import com.example.demo.HServersInterface.DofferServise;
import com.example.demo.Model.AResturant;
import com.example.demo.KReposotiry.AresturantRepo;
import com.example.demo.Model.BAddress;
import com.example.demo.Model.DOffer;
import com.example.demo.Model.FMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private AResturantRest aResturantRest;

    @Autowired
    private FMenuRest  fMenuRest;

    @Autowired
    private DOfferRest dOfferRest;


    @GetMapping(value = {"/"})
    public String getformPage(Model model){
        model.addAttribute("Returant" , new AResturant());
        model.addAttribute("Address" , new BAddress());

        return "WebPages/formPage";
    }

    @PostMapping(value = {"/saveRest"})
    public String saveRest(@Valid AResturant aResturant , @Valid BAddress bAddress , Model model , BindingResult bindingResult){


        model.addAttribute("Returant" , new AResturant());
        model.addAttribute("Address" , new BAddress());
        if(bindingResult.hasErrors()){
            return "WebPages/formPage";

        }
        else {
            aResturant.setResturentAddress(bAddress);
            aResturantRest.saveData(aResturant);
        }
        return "WebPages/formPage";
    }


    @GetMapping(value = {"/allResturent"})
    public String getResurant(Model model){
        model.addAttribute("AllRest",aResturantRest.getResurant());
        return "WebPages/Restrurant";
    }

    @GetMapping(value = {"/fullRestDetai"})
    public String getOneRestTEst(Model model){
        model.addAttribute("RestOneDet",aResturantRest.getResurant());
        return "WebPages/RestrurantFullDetails";
    }

    @GetMapping(value ="/fullRestDetai/{id}")
    public String getOneRest(@PathVariable("id") Long id ,Model model){
        model.addAttribute("RestOneDet",aResturantRest.getOneResurant(id));
        return "WebPages/RestrurantFullDetails";
    }
/***************************** adding Menu******************************************/
    @GetMapping(value = {"/addMenu/{id}"})
    public String addMenu(@PathVariable("id") Long id ,Model model){
        model.addAttribute("One",aResturantRest.getOneResurant(id));
        model.addAttribute("menu",new FMenu());
        return "WebPages/addMenu";
    }

   @PostMapping(value = {"/addMenu/{resId}/save"})
    public String saveMenu(@Valid FMenu menu,@PathVariable("resId") Long id,Model model , BindingResult bindingResult){
            model.addAttribute("One",aResturantRest.getOneResurant(id));
            model.addAttribute("menu",new FMenu());

        if (bindingResult.hasErrors()){
            return "WebPages/addMenu";
        }
        AResturant r = aResturantRest.getOneResurant(id);
        menu.setResturant(r);
        aResturantRest.saveData(r);
        fMenuRest.saveData(menu);
        return "WebPages/addMenu";
    }


 /****************************** adding offer***************************************/
     @GetMapping(value = {"/addOffer/{id}"})
     public String addOffer(@PathVariable("id") Long id ,Model model){
         model.addAttribute("One",aResturantRest.getOneResurant(id));
         model.addAttribute("offe",new DOffer());
         return "WebPages/addOffer";
     }

     @PostMapping(value = {"/addOffer/{resId}/save"})
     public String saveOffer(@Valid DOffer offer ,@PathVariable("resId") Long id,Model model , BindingResult bindingResult){
         model.addAttribute("One",aResturantRest.getOneResurant(id));
         model.addAttribute("offe",new DOffer());

         if (bindingResult.hasErrors()){
             return "WebPages/addOffer";
         }

         AResturant r = aResturantRest.getOneResurant(id);
         offer.setResturant(r);
         aResturantRest.saveData(r);
         dOfferRest.saveData(offer);
         return "WebPages/addOffer";
     }

     /*************************** deletet offer ************************************/
     @GetMapping(value = {"/deleteOffer/{id}/offer"})
    public  String deleteOffer(@PathVariable("id") Long id){
         dOfferRest.deleteOffer(id);
        return "redirect:/fullRestDetai"; //@getMapping value

     }
}












