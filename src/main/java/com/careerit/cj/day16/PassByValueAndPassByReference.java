package com.careerit.cj.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap(10, 20);
        int[] numArr = new int[]{1, 2, 3, 4, 5};
        increment(numArr);
        System.out.println(Arrays.toString(numArr));
        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("Tanvi");
        removeElement(list,"Manoj");
        System.out.println(list);
    }

    public static void swap(int a, int b) {
        System.out.println("Before swap a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a = " + a + " b = " + b);
    }

    public static void increment(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void removeElement(List<String> list,String ele){
        list.remove(ele);
        list.add("Hello");
        System.out.println(list);
    }


}
