package com.example.demo.KReposotiry;

import com.example.demo.Model.AResturant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
//@Transactional
public interface AresturantRepo extends JpaRepository<AResturant ,Long> {

    @Query(value = "select  * from  AResturant where is_delete=false " , nativeQuery = true)
    List<AResturant> findAllAndis__delete();
}
