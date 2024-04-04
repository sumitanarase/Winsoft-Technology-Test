import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, welcome to the world of programming. Java is a popular programming language.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
