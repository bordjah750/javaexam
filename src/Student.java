import java.util.ArrayList;

public class Student extends Person {

    private int studentId;
    private String department;
    private ArrayList<String> courseList;
    private double average;

    public Student(String name, int age, String gender, String address, String email, String phoneNumber,
                   int studentId, String department, ArrayList<String> courseList, double average) {
        super(name, age, gender, address, email, phoneNumber);
        this.studentId = studentId;
        this.department = department;
        this.courseList = courseList;
        this.average = average;
    }

    public Student(String name, int age, String gender, String address, String email, String phoneNumber) {
        super(name, age, gender, address, email, phoneNumber);
        this.studentId = (int) (Math.random() * 100000);
        this.department = "";
        this.courseList = new ArrayList<>();
        this.average = 0.0;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId + "\nDepartment: " + department + "\nCourse List: " + courseList + "\nAverage: " + average;
    }
}
