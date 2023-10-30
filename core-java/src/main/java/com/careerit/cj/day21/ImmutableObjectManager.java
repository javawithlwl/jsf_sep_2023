package com.careerit.cj.day21;

import java.util.Objects;

record Employee(String empno, String name, String email, double salary) {}


final class Product {

    private final String pid;
    private final String pname;
    private final double price;

    public Product(String pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public Product updatePrice(double price) {
        return new Product(this.pid, this.pname, price);
    }

    public String getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getPid(), product.getPid()) && Objects.equals(getPname(), product.getPname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPid(), getPname(), getPrice());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("pid='").append(pid).append('\'');
        sb.append(", pname='").append(pname).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

public class ImmutableObjectManager {

    public static void main(String[] args) {

        Product product = new Product("P001", "Dell Laptop", 45000);
        System.out.println(product);
        Product product1 = product.updatePrice(50000);
        System.out.println(product1);

        Employee emp1 = new Employee("EMP001", "Krish","krish@mad.com", 45000);
        Employee emp2 = new Employee("EMP002", "Charan","charan@mad.com",55000);
        System.out.println(emp1);
        System.out.println(emp1.equals(emp2));
    }
}
