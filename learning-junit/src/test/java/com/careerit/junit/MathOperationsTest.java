package com.careerit.junit;

import org.junit.jupiter.api.*;

public class MathOperationsTest {
    MathOperations obj;

    @BeforeEach
    void init() {
        System.out.println("Before each method");
        obj = new MathOperations();
    }

    @AfterEach
    void destory() {
        System.out.println("After each method");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("After all method");
    }

    @BeforeAll
    static void initAll(){
        System.out.println("Before all method");
    }

    @Test
    void gcdOfTwoEqualNumbers() {
        int actual = obj.gcd(10, 10);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void gcdOfTwoDifferentNumbers() {
        int actual = obj.gcd(10, 20);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void gcdWithPrimeNumbers() {
        int actual = obj.gcd(13, 17);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void gcdWithZero() {
        int actual = obj.gcd(0, 13);
        int expected = 13;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void generatePrimeInRangeTest() {
        int[] actual = obj.generatePrime(10, 20);
        int[] expected = {11, 13, 17, 19};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void generatePrimeWithLowerBoundMaxAndUpperBoundMin() {
        int[] actual = obj.generatePrime(20, 10);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void generatePrimeWith0T1(){
        int[] actual = obj.generatePrime(0, 1);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
    @DisplayName("Generate prime numbers with negative numbers")
    @Test
    @Disabled
    void generatePrimeWithNegativeNumbers(){
        Assertions.assertThrows(IllegalArgumentException.class,()->obj.generatePrime(-10, -1));
    }

    @Test
    void divTest(){
        Assertions.assertThrows(ArithmeticException.class,()->obj.div(10, 0));
    }
}
