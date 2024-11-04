import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("      a good   example   "));
    }

    public static String reverseWords(String s) {
        String cleanString = cleanString(s);

        String[] tokens = cleanString.split(" ");
        List<String> l = new ArrayList<>(Arrays.stream(tokens).toList());

        Collections.reverse(l);

        StringBuilder sb = new StringBuilder();
        for (String ch : l) {
            sb.append(ch);
            sb.append(" ");
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String cleanString(String s) {
        char[] characters = s.trim().toCharArray();
        StringBuilder cleanString = new StringBuilder();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' ' && characters[i + 1] == ' ') {
                continue;
            }
            cleanString.append(characters[i]);
        }
        return cleanString.toString();
    }
}