package one;

public class Student extends Person{


    public Student(String name, Size size) {
        super(name, size);
    }
    private int studentID;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
