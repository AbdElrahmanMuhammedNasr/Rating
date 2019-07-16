package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class KRate {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long rateId;

    @Column(name = "Rate")
    private Long rateNumber;

    @Column(name = "Reason")
    private String rateReason;

    @ManyToOne
    private FMenu fMenu;

}
