package com.example.demo.AinitData;

import com.example.demo.KReposotiry.AresturantRepo;
import com.example.demo.Model.AResturant;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Optional;

import static org.junit.Assert.*;

@Slf4j
public class intiDataTest {
    intiData in = new intiData();

    @Autowired
    private AresturantRepo aresturantRepo;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void run_Test() {
      Optional<AResturant> r = aresturantRepo.findById(2l);
      //  assertEquals(1 ,aresturantRepo.count());
        log.info(String.valueOf(r));

    }
}