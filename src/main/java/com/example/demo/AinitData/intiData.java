package com.example.demo.AinitData;

import com.example.demo.Model.AResturant;
import com.example.demo.Model.FMenu;
import com.example.demo.Model.KRate;
import com.example.demo.ZReposotiry.AresturantRepo;
import com.example.demo.ZReposotiry.FmenuRepo;
import com.example.demo.ZReposotiry.KRateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class intiData implements CommandLineRunner {
    @Autowired
    private FmenuRepo fmenuRepo;
    @Autowired
    private KRateRepo kRateRepo;
    @Autowired
    private AresturantRepo aresturantRepo;

    @Override
    public void run(String... args) throws Exception {

        try {
            AResturant a1 = new AResturant();
            a1.setResturantImage(new  byte[10]);
            a1.setResturantName("ElGa3an");
            a1.setResturentAddress("Tanat - ElBahr street");
            a1.setResturantDetails("Omer Saad");


            FMenu m1 = new FMenu();



                // menu 1
            m1.setFoodName("fool");
            m1.setFoodPrice(new Long(50l));
            m1.setFoodDetails("some beans and oli and some staff");
            m1.setResturant(a1);

            //menu 2  the same res
            FMenu m2 = new FMenu();
            m2.setFoodName("Falafel");
            m2.setFoodPrice(new Long(90l));
            m2.setFoodDetails("some green and some staff");
            m2.setResturant(a1);


            KRate r1 = new KRate();
            r1.setRateNumber(6l);
            r1.setRateReason("very hot ");
            r1.setFMenu(m1);

            /******************************************/
             KRate r2 = new KRate();
             r2.setRateNumber(8l);
             r2.setRateReason("very good ");
             r2.setFMenu(m1);
          //   m1.getRates().add(r2);Wrong NullPointerEx
             /*****************************************************/

            aresturantRepo.save(a1);


            fmenuRepo.save(m1);
            fmenuRepo.save(m2);

            kRateRepo.save(r1);
            kRateRepo.save(r2);


        }
        catch (Exception c)
        {
            System.out.println(c.getMessage() );
        }


    }
}
