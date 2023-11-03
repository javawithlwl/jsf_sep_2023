package com.careerit.cj.day30;

import java.lang.reflect.Method;

public class ReflectionApiExample {

    public static void main(String[] args) {

        try {
            Class cls = Class.forName("com.careerit.cj.day30.ReportServiceImpl");
            String superClass = cls.getSuperclass().getName();
            System.out.println(superClass);
            Method[] methods = cls.getDeclaredMethods();
            for(Method m:methods){
                System.out.println(m.getName());
            }
            Class[] interfaces = cls.getInterfaces();
            for(Class c:interfaces){
                System.out.println(c.getName());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
