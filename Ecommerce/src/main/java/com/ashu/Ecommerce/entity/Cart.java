package com.ashu.Ecommerce.entity;

import com.ashu.Ecommerce.dto.CartProductDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cart extends BaseEntity{
    //private Integer id;
    private Integer userId;
    private String date;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CartProduct> products;
    private Integer __v;

}
