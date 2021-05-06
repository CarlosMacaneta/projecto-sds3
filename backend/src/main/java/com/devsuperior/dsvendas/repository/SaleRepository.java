package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CarlosMacaneta
 */
public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
