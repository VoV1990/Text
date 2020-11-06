import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private String sentence = "";

    public Sentence(Word...words) {
        createSentence(words);
    }

    public Sentence() {
    }

    private void createSentence(Word[] words) {
        StringBuilder builder = new StringBuilder();
        for (Word word : words) builder.append(word.getWord()).append(" ");
        sentence = deleteWhitespaces(builder.toString()).concat(".");
    }

    private static String deleteWhitespaces(String whitespace) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(whitespace);
        whitespace = matcher.replaceAll(" ");
        return whitespace.trim();
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
