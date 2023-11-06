package com.careerit.junit;

import org.junit.jupiter.api.Test;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class JunitAnnotationsExampleTest {
    @Test
    void sampleTest(){
        assertEquals(55, Stream.of(1,2,3,4,5,6,7,8,9,10).mapToInt(i->i).sum());
    }
    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("Number Test",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    @Test
    void trueAssumption() {
        assertTrue(5 > 1, "5 is greater than 1");
        assertEquals(7, 5 + 2, "5 + 2 = 7");
    }

}
