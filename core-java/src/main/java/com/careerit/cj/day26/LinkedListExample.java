package com.careerit.cj.day26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("JavaScript");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst("RUST");
        System.out.println(list);
    }
}
