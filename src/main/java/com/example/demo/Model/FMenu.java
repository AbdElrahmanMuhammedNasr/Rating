package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "fMenu" ,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<KRate> rates = new ArrayList<KRate>();

    @ManyToOne
    @JsonIgnore
    private AResturant resturant;
}
