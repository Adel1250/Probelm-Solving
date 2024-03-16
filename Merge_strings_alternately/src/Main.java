public class Main {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    private static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = word1.length();
        int n = word2.length();

        StringBuilder stringBuilder = new StringBuilder();

        while (i < m && j < n) {
            if (k % 2 == 0) {
                stringBuilder.append(word1.charAt(i));
                i++;
            } else {
                stringBuilder.append(word2.charAt(j));
                j++;
            }
            k++;
        }

        while (i < m) {
            stringBuilder.append(word1.charAt(i));
            i++;
        }

        while (j < n) {
            stringBuilder.append(word2.charAt(j));
            j++;
        }

        return stringBuilder.toString();
    }
}