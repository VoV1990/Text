import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
    private String word;
    public Word(String newWord) {
        if(isWord(newWord)) word = newWord;
        else System.out.println("It's not a word");
    }

    private static boolean isWord(String newWord) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(newWord);
        return matcher.matches();
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }
}
