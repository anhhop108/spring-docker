package com.example.springdocker.Controller;

import com.example.springdocker.DTO.ProductDTO;
import com.example.springdocker.Entity.Product;
import com.example.springdocker.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{code}")
    public ResponseEntity findByCodeP(@PathVariable("code") String code){
        return ResponseEntity.ok(productService.findProductByCode(code));
    }

    @PostMapping("/product")
    public ResponseEntity createP(@RequestBody ProductDTO product){
        return ResponseEntity.ok(productService.createProduct(product));
    }
}
