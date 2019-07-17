package com.example.demo.IServersInterfaceImp;

import com.example.demo.HServersInterface.FMenuServise;
import com.example.demo.KReposotiry.FmenuRepo;
import com.example.demo.Model.FMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FMenuServiseImpl implements FMenuServise {
    @Autowired
    private FmenuRepo fmenuRepo;
    @Override
    public List<FMenu> findAllMenu() {
        return fmenuRepo.findAll();
    }
}
