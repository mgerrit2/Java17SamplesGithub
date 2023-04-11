package com.example.Java17Samples.switchKeyWord;

import org.junit.jupiter.api.Test;


/**
 * https://www.baeldung.com/java-switch-pattern-matching
 */
public class TypePatternSpec {

    @Test
    void name() {

        String value = "5";

        System.out.println(getDoubleUsingSwitch(value));

    }

   double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}

