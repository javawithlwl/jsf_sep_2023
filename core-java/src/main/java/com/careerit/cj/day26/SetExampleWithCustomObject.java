package com.careerit.cj.day26;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
class Product {
    private int pid;
    private String pname;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getPid() == product.getPid() && Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getPname(), product.getPname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPid(), getPname(), getPrice());
    }
}

public class SetExampleWithCustomObject {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product p1 = new Product(1001, "Dell Laptop", 45000);
        Product p2 = new Product(1002, "HP Laptop", 35000);
        Product p3 = new Product(1001, "Dell Laptop", 45000);
        Product p4 = new Product(1003, "Lenovo Laptop", 25000);
        Product p5 = new Product(1002, "HP Laptop", 35000);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        System.out.println(products.size());
    }
}
