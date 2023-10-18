package com.careerit.cj.day22;

interface One{
    void m1();
}
interface Two{
    void m2();
}
interface Three{
    void m1();
    void m2();
    void m3();
}
interface Four extends One,Two,Three{

}
interface Five {
    String toString();
}
class CSL2 implements  Five{
    public String toString(){
        return "";
    }

}
class CLS1 implements Four{

        @Override
        public void m1() {

        }

        @Override
        public void m2() {

        }

        @Override
        public void m3() {

        }
}
public class InterfaceExample {
}
