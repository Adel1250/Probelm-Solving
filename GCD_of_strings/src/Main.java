import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABC", "ABCABC"));
        System.out.println(gcdOfStrings("BABABA", "ABAB"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    }

    private static String gcdOfStrings(String str1, String str2) {
        String smallString;
        String largeString;

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        if (str1.equals(str2)) {
            return str1;
        }

        if (str1.length() < str2.length()) {
            smallString = str1;
            largeString = str2;
        } else {
            smallString = str2;
            largeString = str1;
        }

        if (isGCD(largeString, smallString) && smallString.length() <= largeString.length() / 2) {
            return smallString;
        }

        for (int i = smallString.length() - 1; i >= 1; i--) {
            String divisor = smallString.substring(0, i);
            if (isGCD(largeString, divisor) && isGCD(smallString, divisor)) {
                return divisor;
            }
        }

        return "";
    }

    private static boolean isGCD(String str, String divisor) {
        List<String> subStrings = new ArrayList<>();
        boolean flag = true;
        int divisorLength = divisor.length();
        for (int j = 0; j <= str.length() - 1; j = j + divisorLength) {
            subStrings.add(str.substring(j, Math.min(j + divisorLength, str.length())));
        }
        int subStringSize = subStrings.get(0).length();
        if (subStrings.size() == 1) {
            return false;
        }
        for (String subString : subStrings) {
            if (subString.length() != subStringSize) {
                return false;
            }
        }
        for (int k = 0; k < subStrings.size() - 1; k++) {
            if (!subStrings.get(k).equals(subStrings.get(k + 1))) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}