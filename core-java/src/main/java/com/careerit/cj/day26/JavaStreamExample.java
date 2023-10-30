package com.careerit.cj.day26;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));

        // Get the sum of all elements

        /*double sum = 0;
        for(Integer ele:list){
            sum += ele;
        }
        System.out.println(sum);*/

        double sum = list.stream()
                         .mapToInt(e->e)
                         .sum();

        /*List<Integer> newList = new ArrayList<>();
        for(Integer ele:list){
            newList.add(ele * ele);
        }
        System.out.println(newList);*/

        List<Integer> newList = list.stream()
                                    .map(e->e * e)
                                    .toList();
        System.out.println(newList);

        // Get elements which are divisible by 3 then multiply by 3 after multiplication get the even numbers
        List<Integer> filteredList = new ArrayList<>();
        for(Integer ele:list){
            if(ele % 3 == 0){
                ele = ele * 2;
                if(ele % 3 == 0){
                    filteredList.add(ele);
                }
            }
        }
        System.out.println(filteredList);

        List<Integer> resList = list.stream()
                                    .filter(e->e % 3 == 0)
                                    .map(e->e * 3)
                                    .filter(e->e % 2 == 0)
                                    .toList();

    }
}
