package com.example.demo.KReposotiry;

import com.example.demo.Model.FMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FmenuRepo  extends JpaRepository<FMenu , Long> {
}
