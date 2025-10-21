package Aufgabe1;

public class NotenDurchschnitt {
    public static double berechneDurchschnitt(int[] noten) {
        if (noten.length == 0) return 0.0;

        double summe = 0;
        for (int note : noten) {
            summe += note;
        }
        double durchschnitt = summe / noten.length;
        return Math.round(durchschnitt * 100.0) / 100.0;
    }
}
