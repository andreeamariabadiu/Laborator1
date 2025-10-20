package noten;

import java.util.Arrays;

public class Aufgabe1 {

    public static int[] getNichtAusreichendeNoten(int[] noten) {
        return Arrays.stream(noten)
                .filter(n -> n < 40)
                .toArray();
    }
}
