package com.ashu.Ecommerce.Mapper;

import com.ashu.Ecommerce.dto.CartDTO;
import com.ashu.Ecommerce.dto.CartProductDTO;
import com.ashu.Ecommerce.entity.Cart;
import com.ashu.Ecommerce.entity.CartProduct;

import java.util.List;

public class CartMapper {


    public static CartDTO toDto(Cart cart) {

        List<CartProductDTO> cartProductDTOS = null;

        if (cart.getProducts() != null) {
            cartProductDTOS = cart.getProducts().stream()
                    .map(CartMapper::toProductDto)
                    .toList();
        }

        return CartDTO.builder()
                .userId(cart.getUserId())
                .date(cart.getDate())
                .products(cartProductDTOS)
                .__v(cart.get__v())
                .build();
    }

    public static CartProductDTO toProductDto(CartProduct cartProductDTO) {
        return CartProductDTO.builder()
                .productId(cartProductDTO.getProductId())
                .quantity(cartProductDTO.getQuantity())
                .build();
    }


    public static Cart toEntity(CartDTO dto) {
        List<CartProduct> cartProductEntities = null;

        if (dto.getProducts() != null) {
            cartProductEntities = dto.getProducts().stream()
                    .map(CartMapper::toProductEntity)
                    .toList();
        }

        return Cart.builder()
                .userId(dto.getUserId())
                .date(dto.getDate())
                .products(cartProductEntities)
                .__v(dto.get__v())
                .build();
    }

    public static CartProduct toProductEntity(CartProductDTO dto) {   // FIXED
        return CartProduct.builder()
                .productId(dto.getProductId())
                .quantity(dto.getQuantity())
                .build();
    }
}
