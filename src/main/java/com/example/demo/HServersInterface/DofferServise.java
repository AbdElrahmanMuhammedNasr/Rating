package com.example.demo.HServersInterface;

import com.example.demo.Model.DOffer;

import java.util.List;

public interface DofferServise {
    List<DOffer> findAllOffer();
    void savaOfferData(DOffer offer);
    void deleteOfferByid(Long id);

}
