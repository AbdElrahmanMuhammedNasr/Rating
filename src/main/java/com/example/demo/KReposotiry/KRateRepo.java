package com.example.demo.KReposotiry;

import com.example.demo.Model.KRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KRateRepo extends JpaRepository<KRate ,Long> {
}
