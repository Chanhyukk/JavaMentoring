package Week3;

public class _3_2 {
    public static void main(String[] args) {
        Classroom cr = new Classroom(2, "G208","Jo");
        String[] str = {"jjj", "ccc", "hhh", "yyy"};
        cr.addStudents(str);
        cr.printClassInfo();
    }
}
