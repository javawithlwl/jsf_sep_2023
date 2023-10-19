package com.careerit.cj.day23;

public class LambdaExample1 {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };
        Runnable r2 = () -> System.out.println("Hello world two!");
        r1.run();
        r2.run();
    }
}

// Object Oriented Programming

// 1. Encapsulation
// 2. Inheritance
// 3. Polymorphism
// 4. Abstraction

// What is inheritance?

// ans: Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.

// What is polymorphism?

// ans: Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

// What is abstraction?

// ans: Abstraction is a process of hiding the implementation details and showing only functionality to the user.

// What is encapsulation?

// ans: Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.


// What is abstract class?

// ans: A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).

// What is interface?

// ans: An interface in Java is a blueprint of a class. It has static constants and abstract methods only.

// What is the difference between abstract class and interface?

// ans: 1) Abstract class can have abstract and non-abstract methods. Interface can have only abstract methods. Since Java 8, it can have default,private and static methods also.
// 2) Abstract class doesn't support multiple inheritance. Interface supports multiple inheritance.
// 3) Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
// 4) Abstract class can provide the implementation of interface. Interface can't provide the implementation of abstract class.
// 5) The abstract keyword is used to declare abstract class. The interface keyword is used to declare interface.
// 6) An abstract class can extend another Java class and implement multiple Java interfaces. An interface can extend another Java interface only.
// 7) An abstract class can be extended using keyword "extends". An interface can be implemented using keyword "implements".

// What is functional interface?

// ans: An interface with single abstract method is called functional interface (also known as Single Abstract Method interfaces or SAM Interfaces). @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method.

// What is lambda expression?

// ans: Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.


