import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String test = "tree";
        System.out.println(sortCharactersByFrequency(test));
    }
    private static String sortCharactersByFrequency(String string) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!frequencies.containsKey(string.charAt(i))) {
                frequencies.put(string.charAt(i), 1);
            } else {
                Integer currentFrequency = frequencies.get(string.charAt(i));
                frequencies.put(string.charAt(i), ++currentFrequency);
            }
        }
        List<Element> elements = new ArrayList<>();
        for (Character character : frequencies.keySet()) {
            elements.add(new Element(frequencies.get(character), character));
        }
        elements.sort(Comparator.comparingInt(Element::frequency).reversed());
        StringBuilder stringBuilder = new StringBuilder();
        for (Element element : elements) {
            stringBuilder.append(String.valueOf(element.letter()).repeat(Math.max(0, element.frequency())));
        }
        return stringBuilder.toString();
    }

    record Element(int frequency, char letter) {
    }
}