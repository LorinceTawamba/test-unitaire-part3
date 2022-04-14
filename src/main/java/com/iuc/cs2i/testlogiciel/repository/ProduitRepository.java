package com.iuc.cs2i.testlogiciel.repository;

import com.iuc.cs2i.testlogiciel.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
