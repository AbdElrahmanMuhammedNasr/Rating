package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AResturant {
    @Id
    @GeneratedValue
    private Long resturantId;
    private byte[] resturantImage;
    private String resturantName;
    private String resturentAddress;
    private String resturantDetails;
    // private  FMenu  restaurantFmenu;
}
