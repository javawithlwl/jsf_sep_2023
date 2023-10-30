package com.careerit.cj.day28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample4 {
    public static void main(String[] args) {
        String data = "Java,Python,Python,.Net,Java,Angular,React,Angular,Java,.Net,Java,Angular";
        String[] words = data.split(",");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCountMap);

        // Occurance of each word in the given string array

        Map<String, Long> map = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }

}
