package com.ashu.Ecommerce.services;

import com.ashu.Ecommerce.dto.ProductDTO;

public interface IProductService {
    ProductDTO getProductById(Long id) throws Exception;
}

/*
* Client <---> Controller (JSON)
* Controller <---> Serice (DTO)
* Service <---> Repository (Entities)    MapperClasses
* Repository <---> Database (SQL)*/