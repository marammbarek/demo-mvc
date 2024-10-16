package com.example.demo_mvc.model;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import lombok.*; 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id; 
private String libelle; 
private Double prix; 
private Integer qteStock; 
// Getters et Setters 
    
}
