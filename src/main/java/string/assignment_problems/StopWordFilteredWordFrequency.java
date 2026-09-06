import java.util.HashMap;

public class StopWordFilteredWordFrequency {

    void printFilteredWordFrequency(String feedback) {

        String text = feedback.toLowerCase();
        text = text.replace(".", "");
        text = text.replace(",", "");

        String[] words = text.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : frequency.keySet()) {
            System.out.println(word + ": " + frequency.get(word));
        }
    }

    public static void main(String[] args) {

        String feedback = "The mentor was great, the session was great and clear.";

        StopWordFilteredWordFrequency obj =
                new StopWordFilteredWordFrequency();

        obj.printFilteredWordFrequency(feedback);
    }
}