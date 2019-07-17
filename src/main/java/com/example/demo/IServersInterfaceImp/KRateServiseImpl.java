package com.example.demo.IServersInterfaceImp;

import com.example.demo.HServersInterface.KRateServise;
import com.example.demo.KReposotiry.KRateRepo;
import com.example.demo.Model.KRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KRateServiseImpl implements KRateServise {
    @Autowired
    private KRateRepo kRateRepo;
    @Override
    public List<KRate> findAllRate() {
        return kRateRepo.findAll();
    }
}
