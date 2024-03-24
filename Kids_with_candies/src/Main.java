import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        List<Boolean> kidsWithGreatestNumberOfCandies = new ArrayList<>();
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int candy : candies) {
            if ((candy + extraCandies) >= maxCandies) {
                kidsWithGreatestNumberOfCandies.add(true);
            } else {
                kidsWithGreatestNumberOfCandies.add(false);
            }
        }
        return kidsWithGreatestNumberOfCandies;
    }
}