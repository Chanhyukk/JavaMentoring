package Week7;

public class _7_3 {
    public static void main(String[] args) {
        String[] subject = {"I", "You", "A friend of mine"};
        String[] verb = {"play", "love", "eat"};
        String[] etc = {"a football", "to eat"};
        for (int i = 0; i < 10; i++) {
            Sentence sentence = new Sentence(subject, verb, etc);
            System.out.println(sentence.saySentence());
        }
    }
}
