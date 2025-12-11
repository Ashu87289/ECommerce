package com.ashu.Ecommerce.services;

import com.ashu.Ecommerce.dto.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements IProductService{
    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return null;
    }
}
