package Model;

public class Student extends User {
    private int studentId;
    public Student(String firstName, String secondName, String lastName,int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}