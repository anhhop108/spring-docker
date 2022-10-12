package com.example.springdocker.Service;

import com.example.springdocker.DTO.ProductDTO;
import com.example.springdocker.Entity.Product;
import com.example.springdocker.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findProductByCode(String code) {
        return productRepository.findByProductCode(code);
    }

    @Override
    public Product createProduct(ProductDTO productDTO) {
        Product p = new Product();
        p.setProductCode(productDTO.getProductCode());
        p.setProductName(productDTO.getProductName());
        return productRepository.save(p);
    }
}
