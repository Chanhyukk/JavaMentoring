package Week7;

public class Sentence {
    private String[] subject;
    private String[] verb;
    private String[] end;
    private StringBuilder sb;
    public Sentence(String[] subject, String[] verb, String[] end) {
        this.subject = subject;
        this.verb = verb;
        this.end = end;
        this.sb = new StringBuilder();
    }
    public String saySentence() {
        sb.append(subject[(int) (Math.random() * subject.length)] + " ");
        sb.append(verb[(int) (Math.random() * verb.length)] + " ");
        sb.append(end[(int) (Math.random() * end.length)] + ".");
        return sb.toString();
    }
}
