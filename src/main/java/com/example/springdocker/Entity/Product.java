package com.example.springdocker.Entity;

import javax.persistence.*;

@Entity
@Table
public class Product {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String productName;
    private String productCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
