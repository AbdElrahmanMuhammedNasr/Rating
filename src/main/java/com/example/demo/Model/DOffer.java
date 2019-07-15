package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DOffer {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long offerId;
    @Column(name = "ResturentName")
    private String  resturant;
    @Column(name = "Offer")
    private String offer;

}
