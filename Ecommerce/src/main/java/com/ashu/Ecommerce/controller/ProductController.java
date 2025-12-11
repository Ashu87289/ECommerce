package com.ashu.Ecommerce.controller;

import com.ashu.Ecommerce.dto.ProductDTO;
import com.ashu.Ecommerce.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public void getProductId(@PathVariable Long id){

    }

    /*public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.create(dto));
    }*/
}
