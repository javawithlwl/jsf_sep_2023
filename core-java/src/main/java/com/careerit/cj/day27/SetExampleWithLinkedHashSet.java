package com.careerit.cj.day27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExampleWithLinkedHashSet {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C#");
        set.add("JavaScript");
        set.add("Java");
        set.add("PHP");

        System.out.println(set);

    }
}
