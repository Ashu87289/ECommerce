package com.ashu.Ecommerce.gateway;

import com.ashu.Ecommerce.configuration.RestTemplateConfig;
import com.ashu.Ecommerce.dto.CartDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component("fakeStoreRestTemplateGateway")
@AllArgsConstructor
public class FakeStoreRestTemplateGateway implements ICartGateway{

    private final RestTemplate restTemplate;

    @Override
    public List<CartDTO> getAllCarts() throws IOException {
        String url = "https://fakestoreapi.com/carts";
        System.out.println("URL : " + url);
        try {
            ResponseEntity<CartDTO[]> response = restTemplate.getForEntity(url, CartDTO[].class);

            CartDTO[] body = response.getBody();

            if (response.getBody() == null  ) {
                throw new IOException("Failed to fetch the Carts Data.");
            }
            return Arrays.asList(body);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Error fetching carts: " + e.getMessage(), e);
        }

    }

    @Override
    public CartDTO getCartById(int id) throws IOException {
        String url = "https://fakestoreapi.com/carts/" + id;
        try{
            CartDTO response = restTemplate.getForEntity(url,CartDTO.class).getBody();
            if(response == null){
                throw new IOException("Cart Not found!");
            }
            return response;

        }catch (Exception e){
            e.printStackTrace();
            throw new IOException("failed to fetch the data for the given id : " + id);
        }
    }
}
