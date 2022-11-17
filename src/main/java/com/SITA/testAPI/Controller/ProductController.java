package com.SITA.testAPI.Controller;

import com.SITA.testAPI.DTO.ProductDto;
import com.SITA.testAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get/{id}")
    public ProductDto getProductByIdController(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @Transactional
    @GetMapping("/getAll")
    public List<ProductDto> getAllProductsController(){
        return productService.getAllProducts();
    }

    @PostMapping("/save")
    public void addProductController(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
        System.out.println("Product Successfully added to database!");
    }
}
