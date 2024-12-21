public class Main {
    public static void main(String[] args) {
        int[] sample = {2,1,-1};
        System.out.println(pivotIndex(sample));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int indexSum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (indexSum == sum - indexSum - nums[i]) {
                return i;
            }
            indexSum += nums[i];
        }

        return -1;
    }
}