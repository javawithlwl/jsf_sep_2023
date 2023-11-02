package com.careerit.jdbc.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOperationsTest {

    @Test
    void gcdWithSmallNumber() {
        NumberOperations obj = new NumberOperations();
        int res = obj.gcd(12, 9);
        Assertions.assertEquals(3, res);
    }

    @Test
    void gcdWithSameNumber() {
        NumberOperations obj = new NumberOperations();
        int res = obj.gcd(12, 12);
        Assertions.assertEquals(12, res);
    }

    @Test
    void gcdBasBigNumber() {
        NumberOperations obj = new NumberOperations();
        int res = obj.gcd(1200, 900);
        Assertions.assertEquals(300, res);
    }

    @Test
    void gcdAAsBig() {
        NumberOperations obj = new NumberOperations();
        int res = obj.gcd(1200, 900);
        Assertions.assertEquals(300, res);
    }
}
