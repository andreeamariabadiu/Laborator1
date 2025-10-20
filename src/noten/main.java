package noten;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};

        System.out.println("1. Nicht ausreichend: " +
                Arrays.toString(NichtAusreichend.nichtAusreichend(noten)));

        System.out.printf("2. Durchschnitt: %.2f\n", NotenDurchschnitt.berechneDurchschnitt(noten));

        System.out.println("3. Abgerundet: " +
                Arrays.toString(NotenRunden.rundeNoten(noten)));

        System.out.println("4. Max abgerundet: " +
                MaxAbgerundeteNote.maxAbgerundet(noten));
    }
}
