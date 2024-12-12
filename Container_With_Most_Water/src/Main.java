public class Main {
    public static void main(String[] args) {
        int[] sample = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(sample));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (left != right) {
            int area = (right - left) * Integer.min(height[left], height[right]);
            if (area >= max)
                max = area;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}