package com.careerit.cj.day14;

import java.util.List;

public class StringMethodExample2 {

    public static void main(String[] args) {

        List<String> names = List.of("Krish", "Manoj", "Chandu", "Superman", "Tanvi", "Manohar", "Sai", "Manish", "Charan");

        // display the names which contains 'man' in it,
        // Note: case insensitive

        for (String name : names) {
            if (name.toLowerCase().contains("man")) {
                System.out.println(name);
            }
        }

        String str1 = "Raj";
        System.out.println(str1.concat(" Kumar"));
        System.out.println(str1);

        String str2 = "Raj";
        str2 = str2.concat(" Kumar");
        System.out.println(str2);

        String firstName = "Surendra";
        String lastName = "M";
        String middleName = "Babu";
        String fullName = String.join("-",firstName,middleName,lastName); /*firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);*/
        System.out.println(fullName);

        String namesData = String.join(",", names);
        System.out.println(namesData);

    }
}
