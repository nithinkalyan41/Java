package com.ProductDemo;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addProduct(new Product("ASUS TUF","Laptop","In Bag",2023));
        service.addProduct(new Product("ASUS ROG","Mobile","On Table",2024));
        service.addProduct(new Product("ASUS ROG","Keyboard","In Drawer",2022));
        service.addProduct(new Product("ASUS VIVOBOOK","Laptop","In Bag",2022));
        service.addProduct(new Product("ASUS Zenfone","Mobile","Shelf",2020));
        List<Product> products = service.getAllProducts();
        for(Product product:products){
            System.out.println(product);
        }
        System.out.println("==================================================================");
        System.out.println("Particular product:");
        Product p = service.getProduct("ASUS TUF");
        System.out.println(p);
        List<Product> productByplace = service.getAllProductsInPlace("In Bag");
        System.out.println("====================================================================");
        System.out.println(productByplace);
        System.out.println("====================================================================");
        System.out.println("a particular test");
        List<Product> prods = service.getProductWithText("In");
    }
}