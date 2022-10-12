package com.example.springdocker.Service;

import com.example.springdocker.DTO.ProductDTO;
import com.example.springdocker.Entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    Product findProductByCode(String code) ;

    Product createProduct(ProductDTO productDTO);
}
