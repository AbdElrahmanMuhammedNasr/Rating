package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class DOffer {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long offerId;

    @Column(name = "Offer")
    private String offer;

    @Column(name = "Star_time")
    private String startOffer;

    @Column(name = "End_Time")
    private String endOffer;

    @ManyToOne // it is eager by defult   //fetch = FetchType.LAZY display only offer
    @JsonIgnore
    private AResturant  resturant;



}
