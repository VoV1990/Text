public class Main {
    public static void main(String[] args) {
        Word word = new Word("Hello");
        Word word1 = new Word("World");
        Word word2 = new Word("Bye");
        Word word3 = new Word("Bye");
        Sentence sentence = new Sentence(word, word1);
        Sentence sentence1 = new Sentence(word2, word3);

        Text text = new Text(sentence, sentence1);
        text.addText("Air");
        text.addText(new Word("Fire"));
        text.addText(new Sentence(new Word("Water")));
        text.printText();
        text.printHeaderOfText();
    }
}
