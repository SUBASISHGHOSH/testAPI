package com.SITA.testAPI.Service;

import com.SITA.testAPI.DTO.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto getProductById(Integer id);
    List<ProductDto> getAllProducts();
    void addProduct(ProductDto productDto);
}
