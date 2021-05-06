package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author CarlosMacaneta
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {
    
    @Autowired
    private SellerService sellerService;
    
    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> list = sellerService.findAll();
        
        return ResponseEntity.ok().body(list);
    }
}
