package com.careerit.cj.day28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"Krish");
        map.put(1002,"Manoj");
        map.put(1003,"Charan");
        map.put(1004,"Ramakrishna");

        Set<Integer> keys = map.keySet();
        for(Integer key:keys) {
        	System.out.println(key+" : "+map.get(key));
        }

        System.out.println("--------------------");
        Collection<String> values = map.values();
        for(String name:values) {
        	System.out.println(name);
        }

        System.out.println("--------------------");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for(Map.Entry<Integer, String> entry:entrySet) {
        	System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
