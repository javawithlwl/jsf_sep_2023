package com.careerit.cj.day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsExample1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("KVR");
        names.add("NVR");
        names.add("GVR");
        names.add("ALN");
        names.add("PKM");
        names.add("MKR");
        //Collections.sort(names,Comparator.reverseOrder());
        List<String> sortedList = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(names);
        System.out.println(sortedList);
    }
}
