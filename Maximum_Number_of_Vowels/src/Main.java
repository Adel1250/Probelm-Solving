import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }

    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // If there are not enough elements for the subarray
        if (n < k) {
            throw new IllegalArgumentException("Not enough elements for the subarray of size k");
        }

        // Calculate the sum of the first window
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int currSum = maxSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            currSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static int maxVowels(String s, int k) {
        int[] bool = new int[s.length()];
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i)))
                bool[i] = 1;
            else bool[i] = 0;
        }
        return maxSumSubarray(bool, k);
    }
}