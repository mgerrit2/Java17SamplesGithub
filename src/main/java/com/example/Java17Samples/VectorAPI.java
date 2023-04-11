package com.example.Java17Samples;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;


/**
 * not working
 * java.lang.NoClassDefFoundError: jdk/incubator/vector/Vector
 * Solving later
 */
public class VectorAPI {

    /**/
    static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;
    public  static void vectorSumInt(int[] arrayOne, int[] arrayTwo, int[] s) {
        int i = 0;
        int upperBound = SPECIES.loopBound(arrayOne.length);
        for (; i < upperBound; i += SPECIES.length()) {
            var vIntaOne = IntVector.fromArray(SPECIES,
                    arrayOne, i);
            var vIntaTwo = IntVector.fromArray(SPECIES,
                    arrayTwo, i);
            var vs = vIntaOne.add(vIntaTwo);
            vs.intoArray(s, i);
        }
        for (; i < arrayOne.length; i++) {
            s[i] = (arrayOne[i]  + arrayTwo[i] );
        }
    }
}
