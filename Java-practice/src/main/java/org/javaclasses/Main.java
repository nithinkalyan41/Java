package org.javaclasses;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Pojo customer = new Pojo();
        customer.setCustomerId(1246);
        customer.setName("nithin");
        customer.setAddress("518301");
        System.out.println(customer.getCustomerId()+" "+ customer.getName()+" "+customer.getAddress());
    }
}