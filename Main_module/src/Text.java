public class Text {
    private static String text;
    private static Sentence[]sentences;

    public Text() {
    }

    public Text(Sentence... newSentences) {
        cloneArray(newSentences);
    }

    public Text(Word... words) {
        Sentence sentence = new Sentence(words);
        cloneArray(sentence);
    }

    private static void cloneArray(Sentence... newSentences) {
        Sentence[]tempBase = new Sentence[0];
        if(sentences != null) {
            tempBase = sentences;
            sentences = new Sentence[tempBase.length + newSentences.length];
        } else sentences = new Sentence[newSentences.length];
        int index = 0;
        int index2 = 0;
        for (; index < tempBase.length; index++) {
            sentences[index] = tempBase[index];
        }
        for (; index2 < newSentences.length; index2++) {
            sentences[index] = newSentences[index2];
            index++;
        }
        createText();
    }

    private static void createText() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence : sentences) builder.append(sentence.getSentence()).append(" ");
        text = builder.toString().trim();
    }

    public void addText(Word...words) {
        Sentence sentence = new Sentence(words);
        cloneArray(sentence);
    }

    public void addText(Sentence...sentences) {
        cloneArray(sentences);
    }

    public void addText(String string) {
        Sentence sentence = new Sentence(new Word(string));
        cloneArray(sentence);
    }

    public void printText() {
        System.out.println(text);
    }

    public void printHeaderOfText() {
        System.out.println("The header of text: " + sentences[0]);
    }
}
