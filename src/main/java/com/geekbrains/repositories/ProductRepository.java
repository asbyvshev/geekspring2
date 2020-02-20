package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;


import java.util.ArrayList;

import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<Product>();

    public Product findOneById(int id) {
        Product product;
        for (Product p:productList) {
            if (id == p.getId()){
                product = productList.get(p.getId());
                return product;
            }
        }
        return null;
    }

    public void addProduct (int id, String title, double cost){
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setCost(cost);
        productList.add(product);
    }
}
