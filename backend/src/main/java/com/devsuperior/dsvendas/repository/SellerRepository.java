package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CarlosMacaneta
 */
public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
