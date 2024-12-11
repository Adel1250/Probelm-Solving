public class Main {
    public static void main(String[] args) {
        char[] sample = {'a','a','b','b','c','c','c'};
        System.out.println(compress(sample));
    }
    public static int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && currentChar == chars[read]) {
                read++;
                count++;
            }
            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}