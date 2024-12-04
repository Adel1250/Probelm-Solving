import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sample = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(sample)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = productExceptZeroes(nums);
        int zeroesCount = countZeroes(nums);

        if (zeroesCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = 0;
            }
        } else if (zeroesCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    result[i] = 0;
                } else {
                    result[i] = product;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                result[i] = product / nums[i];
            }
        }
        return result;
    }

    public static int countZeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0)
                count++;
        }
        return count;
    }

    public static int productExceptZeroes(int[] nums) {
        int product = 1;
        for (int num : nums) {
            if (num != 0)
                product *= num;
        }
        return product;
    }
}