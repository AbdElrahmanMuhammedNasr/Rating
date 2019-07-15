package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KRate {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long rateId;
    @Column(name = "Rate")
    private String rateNumber;
    @Column(name = "Reason")
    private String rateReason;

}
