package com.careerit.cj.day1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

public class AnagramExample {


    public static void main(String[] args) {
        // create 10 products and store in array
        Product[] products = new Product[10];
        products[0] = new Product(1001,"Dell Inspiron 15",45000,"Dell","Laptop",10);
        products[1] = new Product(1002,"Dell Inspiron 16",55000,"Dell","Laptop",10);
        products[2] = new Product(1003,"Dell Inspiron 17",65000,"Dell","Laptop",10);
        products[3] = new Product(1004,"Dell Inspiron 18",75000,"Dell","Laptop",10);
        products[4] = new Product(1005,"Dell Inspiron 19",85000,"Dell","Laptop",10);
    }
    private boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    
    private boolean isEven(int num){
        return num % 2 == 0;
    }
}
@Getter
@Setter
@AllArgsConstructor
class Product{
    private int pid;
    private String pname;
    private double price;
    private String brand;
    private String category;
    private int quantity;

}
