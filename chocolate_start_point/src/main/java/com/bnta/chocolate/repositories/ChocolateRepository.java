package com.bnta.chocolate.repositories;

import com.bnta.chocolate.models.Chocolate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChocolateRepository extends JpaRepository<Chocolate, Long> {


        @Query(value = "SELECT * FROM chocolate WHERE id = ?1",
                nativeQuery = true)
        Chocolate getChocolate(int id);


        @Query(value = "SELECT * FROM chocolate WHERE cocoa_percentage>=60",nativeQuery = true)
        List<Chocolate> getChocCocoa();
}
