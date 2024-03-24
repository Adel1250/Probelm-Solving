public class Main {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }
    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                return true;
            }
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                break;
            }
            if (i == 0) {
                if (flowerbed[i] == 0) {
                    if (flowerbed[1] == 0) {
                        flowerbed[0] = 1;
                        n--;
                    }
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            } else {
                if (flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }

        }
        return n == 0;
    }
}