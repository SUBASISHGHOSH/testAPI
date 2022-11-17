package com.SITA.testAPI.DTO;

import com.SITA.testAPI.Entity.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.SITA.testAPI.Entity.Product} entity
 */
@Data
@NoArgsConstructor
public class ProductDto implements Serializable {
    private  Integer id;
    private  String name;
    private  String description;
    private  Integer price;

    public ProductDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }
}