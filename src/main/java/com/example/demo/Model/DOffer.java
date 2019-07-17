package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DOffer {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long offerId;

    @Column(name = "Offer")
    private String offer;

    @ManyToOne
    @JsonIgnore
    private AResturant  resturant;



}
