package com.careerit.cj.day13.two;

import com.careerit.cj.day13.one.A;

/**
 * This is the example for protected access modifier
 */
public class E {
    A obj = new A();
    public void show(){
        /*System.out.println(obj.pri_a);
        System.out.println(obj.def_a);
        System.out.println(obj.pro_a);*/
        System.out.println(obj.pub_a);
    }


}
