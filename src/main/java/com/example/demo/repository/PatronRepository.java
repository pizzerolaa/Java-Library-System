package com.example.demo.repository;

import com.example.demo.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Long> {
    Patron findByPatronId(String patronId);
}