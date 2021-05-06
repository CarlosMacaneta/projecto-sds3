package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author CarlosMacaneta
 */
@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;
    
    @Autowired
    private SaleRepository saleRepository1;
            
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        saleRepository1.findAll();
        
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(m -> new SaleDTO(m));
    }
    
}
