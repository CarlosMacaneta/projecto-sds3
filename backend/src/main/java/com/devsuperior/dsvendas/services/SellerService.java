package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repository.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CarlosMacaneta
 */
@Service
public class SellerService {
    
    @Autowired
    private SellerRepository sellerRepository;
    
    public List<SellerDTO> findAll() {
        List<Seller> results = sellerRepository.findAll();
        return results.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
