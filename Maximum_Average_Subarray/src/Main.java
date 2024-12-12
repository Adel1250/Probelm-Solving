public class Main {
    public static void main(String[] args) {
        int[] sample = {0, 1, 1, 3, 3};
        System.out.println(findMaxAverage(sample, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        if (nums.length == k)
            return sum / k;

        int left = 1;
        int right = k;
        double max = -Double.MAX_VALUE;
        if (sum >= max)
            max = sum;

        while (right < nums.length) {
            sum = sum - nums[left - 1] + nums[right];
            max = Double.max(max, sum);
            right++;
            left++;
        }

        return max / k;
    }
}