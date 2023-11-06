package com.careerit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmiCalculatorTest {


    @Test
    void testCalculateEmi() {
        EmiCalculator emiCalculator = new EmiCalculator();
        double emi = emiCalculator.calculateEmi(850000, 15, 27);
        double expected = 37287;
        Assertions.assertEquals(expected, emi);
    }

}
