package com.ProductDemo;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }
    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public List<Product> getAllProductsInPlace(String place) {
        List<Product> res = new ArrayList<>();
        for(Product p : products){
            if(p.getPlace().equals("In Bag")){
                res.add(p);
            }
        }
        return res;
    }

    public List<Product> getProductWithText(String in) {
        
    }
}
