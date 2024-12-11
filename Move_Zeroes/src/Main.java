import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sample = {0,1,0,3,12};
        moveZeroes(sample);
        System.out.println(Arrays.toString(sample));
    }
    public static void moveZeroes(int[] nums) {
        if (nums.length < 2)
            return;
        int leftPtr = 0;
        int rightPtr = 1;

        while (leftPtr != rightPtr && rightPtr < nums.length) {
            if (nums[leftPtr] == 0) {
                if (nums[rightPtr] != 0) {
                    int temp = nums[leftPtr];
                    nums[leftPtr] = nums[rightPtr];
                    nums[rightPtr] = temp;
                } else {
                    rightPtr++;
                }
            } else {
                leftPtr++;
                rightPtr++;
            }
        }
    }
}