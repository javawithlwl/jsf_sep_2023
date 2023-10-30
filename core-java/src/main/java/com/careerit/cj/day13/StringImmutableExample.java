package com.careerit.cj.day13;

public class StringImmutableExample {

    public static void main(String[] args) {

        String name1 = "CORE JAVA";
        String name2 = "CORE JAVA";
        String name3 = new String("CORE JAVA");
        String name4 = new String("CORE JAVA");

        System.out.println(name1 == name2);
        System.out.println(name3 == name4);

        System.out.println(name3.equals(name4));

    }
}

// = Assignment Op
// == Equality Op