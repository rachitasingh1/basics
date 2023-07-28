package Streams;

import java.util.List;

public class Student {
    String studentname;
    String studentid;
    List<String> cities;

    public Student() {
    }

    public Student(String studentname, String studentid, List<String> cities) {
        this.studentname = studentname;
        this.studentid = studentid;
        this.cities = cities;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Student [studentname=" + studentname + ", studentid=" + studentid + ", cities=" + cities + "]";
    }

}
