public class task6 {
    public static int largestAltitude(int[] gain) {
        int altitude = 0, max = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > max) {
                max = altitude;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }
}