package com.ashu.Ecommerce.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity{


    private String title;
    private String price;
    private String description;
    private String category;
    private String image;
}
