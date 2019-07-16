package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class FMenu {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long foodId;

    @Column(name = "Name")
    private String foodName;

    @Column(name = "Price")
    private Long foodPrice;

    @Column(name = "Datail")
    private String foodDetails;

    @OneToMany(mappedBy = "fMenu")
    private List<KRate> rates;


    @ManyToOne
    private AResturant resturant;
}
