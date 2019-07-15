package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FMenu {
    @Id
    @GeneratedValue
    private Long foodId;
    private String foodName;
    private short foodPrice;
    private String foodDetails;
}
