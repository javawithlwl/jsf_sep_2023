package com.careerit.cj.day18;

import java.util.ArrayList;
import java.util.List;

public class MethodExamples {

    // Class methods or static methods
    // Instance methods or non-static methods

    public List<String> getUniqueNames(List<String> names) {
        List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        return  uniqueNames;
    }

    public static List<String> covertToUpperCase(List<String> names){
        List<String> upperCaseNames = new ArrayList<>();
        for(String name:names){
            upperCaseNames.add(name.toUpperCase());
        }
        return upperCaseNames;
    }


    public static void main(String[] args) {

        List<String> names = List.of("Krish", "Manoj", "Charan", "Krish", "Manoj", "Charan", "Krish", "Manoj", "Charan");
        MethodExamples obj = new MethodExamples();
        List<String> uniqueNames = obj.getUniqueNames(names);
        System.out.println(uniqueNames);
        List<String> upperCaseNames = MethodExamples.covertToUpperCase(uniqueNames);
        System.out.println(upperCaseNames);

        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2, 3));


    }
}
