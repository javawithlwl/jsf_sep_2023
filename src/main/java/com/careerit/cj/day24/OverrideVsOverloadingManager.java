package com.careerit.cj.day24;

import java.io.FileNotFoundException;
import java.io.IOException;

class E1Exception extends Exception {

}
class E2Exception extends E1Exception {

}
class E3Exception extends E2Exception {

}

class One {

    public void m1() {
        System.out.println("One Of m1");
    }

    protected void m1(int a) throws E2Exception {
        System.out.println("One Of m1 with int");
    }

    void m1(int a, int b) {
        System.out.println("One Of m1 with int,int");
    }

}

class Two extends One {
    @Override
    public void m1() {
        System.out.println("Two Of m1");
    }
    @Override
    public void m1(int a)  {
        System.out.println("Two of m2");
    }


}


public class OverrideVsOverloadingManager {
}
