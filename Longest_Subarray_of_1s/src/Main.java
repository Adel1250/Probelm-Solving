public class Main {
    public static void main(String[] args) {
        int[] sample = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(longestSubarray(sample));
    }

    public static int longestSubarray(int[] nums) {
        return longestOnes(nums, 1) - 1;
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int longestOnes = 0;
        int zeroes = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroes++;
            }

            while (zeroes > k) {
                if (nums[left] == 0) {
                    zeroes--;
                }
                left++;
            }

            longestOnes = Math.max(longestOnes, right - left + 1);
            right++;
        }

        return longestOnes;
    }
}