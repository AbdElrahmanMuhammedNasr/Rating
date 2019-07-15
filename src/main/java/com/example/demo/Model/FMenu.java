package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FMenu {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long foodId;
    @Column(name = "Name")
    private String foodName;
    @Column(name = "Price")
    private short foodPrice;
    @Column(name = "Datail")
    private String foodDetails;
}
