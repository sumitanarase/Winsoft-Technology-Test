import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
}
