package com.codeclan.example.Movies.repositories;

import com.codeclan.example.Movies.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
}
