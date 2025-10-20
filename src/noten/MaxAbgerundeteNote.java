package noten;

public class MaxAbgerundeteNote {
    public static int findeMaxAbgerundeteNote(int[] noten) {
        int[] abgerundet = NotenRunden.rundeNoten(noten);
        int max = abgerundet[0];
        for (int note : abgerundet) {
            if (note > max) max = note;
        }
        return max;
    }
}
