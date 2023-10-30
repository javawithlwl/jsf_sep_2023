package com.careerit.cj.day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample3 {

    public static void main(String[] args) {

        Map<String,Integer> ageMap = new HashMap<>();
        ageMap.put("Krish", 30);
        ageMap.put("Manoj", 25);
        ageMap.put("Charan", 28);
        ageMap.put("Ramakrishna", 35);
        // Add element RK with age 33 if not present
        ageMap.putIfAbsent("RK", 33);

        Set<String> keys = ageMap.keySet();
        for(String key:keys) {
           Integer value = ageMap.get(key);
           if(value > 30) {
              value = value + 1;
              ageMap.put(key, value);
           }
        }
        System.out.println(ageMap);


    }
}
