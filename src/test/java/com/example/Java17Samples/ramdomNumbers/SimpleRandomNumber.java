package com.example.Java17Samples.ramdomNumbers;

import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

public class SimpleRandomNumber {
    @Test
    void name() {
        RandomGenerator randomGenerator = RandomGenerator.of("Xoshiro256PlusPlus");

        int counter = 0;

        while (counter<=5){

            counter++;
            int output = randomGenerator.nextInt(6);

            System.out.println(output);
        }
    }

}
