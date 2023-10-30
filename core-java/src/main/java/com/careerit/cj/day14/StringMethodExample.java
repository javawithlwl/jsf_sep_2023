package com.careerit.cj.day14;

import java.util.ArrayList;
import java.util.List;

public class StringMethodExample {

    public static void main(String[] args) {

        String name = "AB221BA";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
        // Check given string is palindrome or not
        if (isPalindrome(name)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 4));

        String names = "JOHN,CV,KRISH,MANOJ,CHARAN,KIRAN";
        String[] arr = names.split(",");
        for (String str : arr) {
            if (str.length() >= 3) {
                System.out.println(str.substring(0, 3));
            } else {
                System.out.println(str);
            }
        }

        // String ABCDEFG -> 3 -> ABC,BCD,CDE,DEF,EFG -> 4 -> ABCD,BCDE,CDEF,DEFG
        String str = "ABCDEFG";
        int n = 4;
        System.out.println(subStringList(str, n));

        String str1 = " Hello ";
        System.out.println(str1.trim().length());

        String str2 = "Hello welcome to java world";
        String res = str2.substring(5, 14).trim().toUpperCase().substring(3);
        System.out.println(res);


    }

    private static List<String> subStringList(String str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= str.length() - n; i++) {
            list.add(str.substring(i, i + n));
        }
        return list;
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
