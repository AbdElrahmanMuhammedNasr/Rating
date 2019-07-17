package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class BAddress {


    private String city;
    private String street;
    private String place;

}
