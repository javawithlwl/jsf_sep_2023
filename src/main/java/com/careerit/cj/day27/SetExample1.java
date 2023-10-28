package com.careerit.cj.day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class SetExample1 {
    public static void main(String[] args) {

        Set<Integer> list = getNumberList(20);
        System.out.println(list);

    }

    private static Set<Integer> getNumberList(int n) {
        Set<Integer> set = new HashSet<>();
        while(set.size() != n){
            set.add(ThreadLocalRandom.current().nextInt(1,n*2));
        }
        return set;

    }
}
