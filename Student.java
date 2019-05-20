// extends means that it is a child of person and has everything that a person class has
//


public class Student extends Person {
    String utorId;
    int studentNumber; // If a person is not a student then these last two things don't apply

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

}
