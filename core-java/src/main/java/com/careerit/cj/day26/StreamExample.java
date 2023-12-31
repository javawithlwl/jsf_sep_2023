package com.careerit.cj.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2).toList();
        System.out.println(twoEvenSquares);

        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
        List<Integer> wordLengths = getWordsLength(words);


    }

    private static List<Integer> getWordsLength(List<String> names) {
        /*List<Integer> list = new ArrayList<>();
        for (String name : names) {
            list.add(name.length());
        }
        return list;*/
        return names.stream()
                .map(String::length)
                .toList();
    }

    public static int sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }


}
