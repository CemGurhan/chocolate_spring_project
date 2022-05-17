package com.bnta.chocolate.repositories;

import com.bnta.chocolate.models.Estate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateRepository extends JpaRepository<Estate, Long> {

    @Query(value = "SELECT * FROM estate WHERE id = ?1",
                nativeQuery=true)
    Estate getEstate(int id);
}
