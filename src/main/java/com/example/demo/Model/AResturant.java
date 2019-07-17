package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class AResturant {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long resturantId;

    @Lob
    @Column(name = "Image")
    private byte[] resturantImage;

    @Column(name = "Name")
    private String resturantName;

    @Column(name = "Address")
    private String resturentAddress;

    @Column(name = "Details")
    private String resturantDetails;

    @OneToMany(mappedBy = "resturant" ,cascade = CascadeType.ALL /*,fetch = FetchType.EAGER*/)
    @JsonIgnore
    private List<FMenu>  restaurantFmenu;


    @OneToMany(mappedBy = "resturant" ,cascade = CascadeType.ALL /*, fetch = FetchType.EAGER*/)
    @JsonIgnore
    private List<DOffer> offers;
}
