package com.school.myapp.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students extends Person{

    @Id
    private String idStudent;
    
    private String studentGroup;
    private int grade;
    private boolean schedule;
    private float score;

    public Students(String idStudent, String name, String lastName, int age, String studentGroup, int grade, boolean schedule, float score) {
        super(name,lastName,age);
        this.idStudent = idStudent;
        this.studentGroup = studentGroup;
        this.grade = grade;
        this.schedule = schedule;
        this.score = score;
    }

    public Students(){
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }
    
    public String getstudentGroup() {
        return studentGroup;
    }

    public void setstudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean getSchedule() {
        return schedule;
    }

    public void setSchedule(boolean schedule) {
        this.schedule = schedule;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
