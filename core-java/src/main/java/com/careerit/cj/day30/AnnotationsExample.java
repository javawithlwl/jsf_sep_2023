package com.careerit.cj.day30;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name() default "ope";

    String value() default "add";
}

class One {

    @MyAnnotation
    public void peform(int a, int b) {
        System.out.println("M1 method");
    }

}

public class AnnotationsExample {

    public static void main(String[] args) {

        try {
            Class cls = Class.forName("com.careerit.cj.day30.One");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
                MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
                String name = myAnnotation.name();
                String value = myAnnotation.value();
                System.out.println(name + " " + value);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
