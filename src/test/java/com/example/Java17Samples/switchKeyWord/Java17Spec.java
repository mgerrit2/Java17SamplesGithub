package com.example.Java17Samples.switchKeyWord;

import org.junit.jupiter.api.Test;

public class Java17Spec
{
    /**
     * Switch java 17
     */
    @Test
    void switch17() {

        final String b = "B";

        switch (b) {
            case "A" -> System.out.println("Parameter is A");
            case b -> System.out.println("Parameter is b");
            default -> System.out.println("Parameter is unknown");
        };

    }


}
