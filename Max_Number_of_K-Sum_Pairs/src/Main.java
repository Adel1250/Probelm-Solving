import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sample = {3, 1, 3, 4, 3};
        System.out.println(maxOperations(sample, 5));
    }

    public static int maxOperations(int[] nums, int k) {
        int ops = 0;
        Arrays.sort(nums);
        nums = Arrays.stream(nums)
                .filter(num -> num <= k)
                .toArray();
        int left = 0;
        int right = nums.length - 1;
        while (right > left) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                left++;
                right--;
                ops++;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return ops;
    }
}