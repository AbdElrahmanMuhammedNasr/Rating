package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Cacheable
//@SQLDelete(sql = "update AResturant set is_delete=true where id=?") // soft delete

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

    @Embedded
    private BAddress resturentAddress;

    @Column(name = "Details")
    private String resturantDetails;

    @OneToMany(mappedBy = "resturant" ,cascade = CascadeType.ALL /*,fetch = FetchType.EAGER*/)
    @JsonIgnore
    private List<FMenu>  restaurantFmenu;


    @OneToMany(mappedBy = "resturant" ,cascade = CascadeType.ALL /*, fetch = FetchType.EAGER*/)
    @JsonIgnore
    private List<DOffer> offers;


}
