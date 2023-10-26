package com.careerit.cj.day25;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProcessingElementFromList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add(".Net");
        list.add("SpringFramework");

        // Using for loop
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }

        // Using for each loop
        for(String ele:list){
            System.out.println(ele);
        }

        // Using forEach method
        list.forEach(System.out::println);


        // Using Iterator

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String ele = iterator.next();
            System.out.println(ele);
            if(ele.equals("Python")){
                iterator.remove();
                break;
            }
        }
        System.out.println("--------------------");
        // Using Consumer
        iterator.forEachRemaining(ele->{
            System.out.println(ele.toUpperCase());
        });

        System.out.println("--------------------");

        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String ele = listIterator.next();
            System.out.println(ele);
            if(ele.equals("Java")){
                listIterator.remove();
            }

        }
        System.out.println("--------------------");
        while(listIterator.hasPrevious()){
            String ele = listIterator.previous();
            if(ele.equals("JavaScript")){
                listIterator.add("ReactJS");
            }
            if(ele.equals("Python")){
                listIterator.set("Python-3.1");
            }
            System.out.println(ele);
        }
        System.out.println("--------------------");
        System.out.println(list);
    }
}


interface  I1{
    I2 getI2();
}
interface  I2{
    boolean isEven(int num);
}
class  C1 implements I1{

        @Override
        public I2 getI2() {
           return new X();
        }

        class X implements  I2{
            @Override
            public boolean isEven(int num) {
                return num % 2 == 0;
            }
        }

}