package com.careerit.cj.day15;

public class StringBuilderExample {

    public static void main(String[] args) {

        String str = "madam";
        System.out.println(isPalindrome(str));
        String str1 = "liril";
        System.out.println(isPalindrome(str1));
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
