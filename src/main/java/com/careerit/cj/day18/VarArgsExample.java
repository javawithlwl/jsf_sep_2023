package com.careerit.cj.day18;

public class VarArgsExample {

    // Var args  (data_type... var_name)
    // 1. Var args should be last parameter
    // 2. Var args should be only one in a method

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public int add(char a,char b, int... c){
        int sum = a + b;
        for(int ele:c){
            sum += ele;
        }
        return sum;
    }

    public int add(int... arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    public  static void main(String... args) {
        VarArgsExample obj = new VarArgsExample();
        int sum = obj.add(10,20,30,40,50);
        System.out.println(sum);
    }
}
