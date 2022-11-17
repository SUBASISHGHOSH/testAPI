package com.SITA.testAPI.Service;

import com.SITA.testAPI.DTO.ProductDto;
import com.SITA.testAPI.Entity.Product;
import com.SITA.testAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDto getProductById(Integer id) {
        Optional<Product> optional = productRepository.findById(id);
        optional.orElseThrow(() -> new RuntimeException("Product Not Found!!"));
        return new ProductDto(optional.get());
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map((dto)->new ProductDto(dto)).collect(Collectors.toList());
    }

    @Override
    public void addProduct(ProductDto productDto) {
        productRepository.save(new Product(productDto));
    }
}
