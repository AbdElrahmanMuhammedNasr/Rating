package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KRate {
    @Id
    @GeneratedValue
    private Long rateId;
    private String rateNumber;
    private String rateReason;

}
