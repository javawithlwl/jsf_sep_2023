package com.careerit.cj.day17;

import java.util.Objects;

class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product [name=%s, price=%s]", name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

public class ObjectClassMethods {

    public static void main(String[] args) {

        Product product = new Product("Dell Laptop", 45000);
        System.out.println(product.toString());

        Product product1 = new Product("Dell Laptop", 45000);
        Product product2 = new Product("Dell Laptop", 45000);
        Product product3 = product1;

        System.out.println(product1 == product2);
        System.out.println(product1 == product3);

        System.out.println(product1.equals(product2));
    }
}
