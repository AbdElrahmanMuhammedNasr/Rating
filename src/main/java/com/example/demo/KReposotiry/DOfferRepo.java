package com.example.demo.KReposotiry;

import com.example.demo.Model.DOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DOfferRepo extends JpaRepository<DOffer ,Long> {
}
