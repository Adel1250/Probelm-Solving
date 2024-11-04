import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IcecreAm"));
    }

    public static String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] characters = s.toCharArray();
        int stringLength = s.length();
        int left = 0;
        int right = stringLength - 1;
        while (left < right) {
            while (left < right && !vowels.contains(characters[left])) {
                left++;
            }

            while (left < right && !vowels.contains(characters[right])) {
                right--;
            }

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }
        return new String(characters);
    }
}