package com.ashu.Ecommerce.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*Each CartProduct belongs to exactly one Cart.
    * many CartProduct entries can be linked to a single Cart*/
    @ManyToOne
    //A join allows you to combine data from two or more tables based on relationship.
    @JoinColumn(name = "cart_id",nullable = false)
    private Cart cart;
    private Integer productId;
    private Integer quantity;
}
