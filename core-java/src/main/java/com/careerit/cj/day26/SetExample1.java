package com.careerit.cj.day26;

import java.util.*;

public class SetExample1 {

    public static void main(String[] args) {

        List<String> list = List.of("Java", "Python", "C#", "JavaScript", "Java", "Python", "Java");
        Set<String> uniqueNames = new HashSet<>(list);
        System.out.println(uniqueNames);

        uniqueNames.forEach(System.out::println);

        for(String name: uniqueNames) {
        	System.out.println(name);
        }

        Iterator<String> itr = uniqueNames.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        uniqueNames.add("PHP");
        uniqueNames.addAll(List.of("Java","Python","Java"));
        System.out.println(uniqueNames.size()!=0);


    }
}
