package noten;

public class NotenRunden {
    public static int[] rundeNoten(int[] noten) {
        int[] abgerundet = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];
            if (note >= 38) {
                int naechstesVielfaches = ((note / 5) + 1) * 5;
                if (naechstesVielfaches - note < 3) {
                    note = naechstesVielfaches;
                }
            }
            abgerundet[i] = note;
        }
        return abgerundet;
    }
}

