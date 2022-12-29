package com.lcdaponte.trackmypet.core.repository;

import com.lcdaponte.trackmypet.core.repository.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, String> {
}
