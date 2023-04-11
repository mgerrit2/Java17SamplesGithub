package com.example.Java17Samples.vectorAPI;


import com.example.Java17Samples.VectorAPI;
import org.junit.jupiter.api.Test;

public class VectorAPISpec {

    @Test
    void normalVector() {
        int[] a = new int[]{1, 3, 2, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = {0, 0, 0, 0};

        nonVectorSumInt(a, b, c);

        System.out.println("nonVectorSumInt");

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }

    /* D:\Programming\Java\java 17\Java17Samples\src\test\java\com\example\Java17Samples\vectorAPI\VectorAPISpec.java:4: error: package jdk.incubator.vector is not visible
import jdk.incubator.vector.IntVector;
*/

    @Test
    void vectorAPI() {
        int[] a = new int[]{1, 3, 2, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = {0, 0, 0, 0};

        VectorAPI.vectorSumInt(a, b, c);

        System.out.println("vectorSumInt");

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }





    void nonVectorSumInt(int[] arrayOne, int[] arrayTwo, int[] s) {
        for (int i = 0; i < arrayOne.length; i++) {
            s[i] = (arrayOne[i]  +  arrayTwo[i]) ;
        }
    }

}
