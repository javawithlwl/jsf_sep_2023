package com.careerit.cj.day16;

import java.util.Arrays;

public class FinalVariablesWithReferenceDataType {

    public static void main(final String[] args) {

        // final variables with reference data type
        System.out.println(Arrays.toString(args));
        args[0] = "Manoj";
        System.out.println(Arrays.toString(args));

    }
}
