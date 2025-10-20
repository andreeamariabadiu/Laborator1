package noten;

public class NichtAusreichend {
    public static int[] nichtAusreichend(int[] noten) {
        int count = 0;
        for (int n : noten) {
            if (n < 40) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int n : noten) {
            if (n < 40) {
                result[index++] = n;
            }
        }
        return result;
    }
}



