import java.time.LocalDate;
import java.util.Date;

public class Student {

    String studentID;
    String first;
    String last;
    LocalDate dob;
    String gender;
    String program;
    String reason;

    Student(String id, String first, String last, LocalDate dob, String gender, String program, String reason){
        this.studentID = id;
        this.first = first;
        this.last = last;
        this.dob = dob;
        this.gender = gender;
        this.program = program;
        this.reason = reason;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String toString(){
        return first + last + studentID + dob + gender + program + reason;
    }
}
