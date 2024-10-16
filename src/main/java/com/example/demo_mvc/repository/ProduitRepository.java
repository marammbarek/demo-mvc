package com.example.demo_mvc.repository;

import com.example.demo_mvc.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // You can define custom query methods here if needed
}
