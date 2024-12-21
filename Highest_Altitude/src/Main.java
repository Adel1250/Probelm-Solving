public class Main {
    public static void main(String[] args) {
        int[] sample = {52,-91,72};
        System.out.println(largestAltitude(sample));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            if (i != 0) {
                gain[i] += gain[i - 1];
            }
            max = Integer.max(max, gain[i]);
        }
        return max;
    }
}