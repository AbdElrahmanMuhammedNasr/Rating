package com.example.demo.IServersInterfaceImp;

import com.example.demo.HServersInterface.DofferServise;
import com.example.demo.KReposotiry.DOfferRepo;
import com.example.demo.Model.DOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DofferServiseImpl implements DofferServise {
    @Autowired
    private DOfferRepo dOfferRepo;

    @Override
    public List<DOffer> findAllOffer() {
        return dOfferRepo.findAll();
    }

    @Override
    public void savaOfferData(DOffer offer) {
        dOfferRepo.save(offer);
    }

    @Override
    public void deleteOfferByid(Long id) {
        dOfferRepo.deleteById(id);
    }
}
