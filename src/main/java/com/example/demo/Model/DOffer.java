package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DOffer {
    @Id
    @GeneratedValue
    private Long offerId;
    private String  resturant;
    private String offer;

}
