package Week3;

public class Classroom {
    private int limitStudentsNum;
    private int studentNum;
    private String classroom;
    private String profName;
    private String[] studentsName;

    public Classroom(int limitStudentsNum, String classroom, String profName) {
        this.limitStudentsNum = limitStudentsNum;
        this.classroom = classroom;
        this.profName = profName;
        studentNum = 0;
        studentsName = new String[limitStudentsNum];
        for (int i = 0; i < limitStudentsNum; i++) {
            studentsName[i] = "";
        }
    }
    public void addStudents(String[] students) {
        for (int i = 0; i < students.length; i++) {
            addStudent(students[i]);
        }

    }
    public void addStudent(String name) {
        if (limitStudentsNum > studentNum) {
            studentsName[studentNum++] += name;
        } else {
            System.out.println("못들어갑니다");
        }
    }
    public void printStudentName() {
        for (int i = 0; i < studentNum; i++) {
            System.out.println("Student name: " + studentsName[i]);
        }
    }
    public void printClassInfo() {
        System.out.println("LimitNum: " + limitStudentsNum);
        System.out.println("Classroom: " + classroom);
        System.out.println("ProName: " + profName);
        System.out.println("StudentNum: " + studentNum);
        printStudentName();
    }
}

