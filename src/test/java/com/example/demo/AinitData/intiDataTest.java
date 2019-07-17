package com.example.demo.AinitData;

import com.example.demo.KReposotiry.AresturantRepo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.Assert.*;

public class intiDataTest {
    intiData in = new intiData();

    @Autowired
    private AresturantRepo aresturantRepo;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void run_Test() {
      //Optional <AResturant> r = aresturantRepo.findById(1l);
        assertEquals(1 ,aresturantRepo.count());
    }
}