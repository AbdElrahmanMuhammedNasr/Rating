package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class AResturant {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long resturantId;
    @Lob
    @Column(name = "Image")
    private byte[] resturantImage;
    @Column(name = "Name")
    private String resturantName;
    @Column(name = "Address")
    private String resturentAddress;
    @Column(name = "Details")
    private String resturantDetails;
    // private  FMenu  restaurantFmenu;
}
