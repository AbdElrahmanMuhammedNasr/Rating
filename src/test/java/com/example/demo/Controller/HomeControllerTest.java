package com.example.demo.Controller;

import com.example.demo.HServersInterface.DofferServise;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HomeControllerTest {
    HomeController  h = new HomeController();


    @Mock
    DofferServise servise;
    //DofferServise servise = mock(DofferServise.class);



    @Test
    public void getOffer() {

            assertEquals(0,servise.findAllOffer().size());
           // Mockito.when(servise.findAllOffer()).thenReturn(10);
    }
}