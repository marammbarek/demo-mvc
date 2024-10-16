package com.example.demo_mvc.controller;

import com.example.demo_mvc.model.Produit; 
import com.example.demo_mvc.service.ProduitService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
 
@Controller 
@RequestMapping("/produits") 
public class ProduitController {
    @Autowired 
    private ProduitService produitService; 
 
    @GetMapping 
    public String getAllProduits(Model model) { 
        model.addAttribute("produits", produitService.findAll()); 
        return "produits"; // Nom de la vue 
    } 
 
    @PostMapping("/add") 
    public String addProduit(Produit produit) { 
        produitService.save(produit); 
        return "redirect:/produits"; // Rediriger vers la liste des produits 
    } 
    
}
