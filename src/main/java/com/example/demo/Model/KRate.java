package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


    @ManyToOne // EAGER
    @JsonIgnore
    private FMenu fMenu;

}
