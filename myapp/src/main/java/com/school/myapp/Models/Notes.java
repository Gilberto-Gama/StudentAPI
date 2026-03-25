package com.school.myapp.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notes {
    
    @Id
    private int idNote;
    
    private String idStudent;
    private int idSubject;
    private double note;

    public Notes(String idStudent, int idSubject, double note) {
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.note = note;
    }
    
    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
    public int getidSubject() {
        return idSubject;
    }

    public double getNote() {
        return note;
    }
    public void setNote(double note) {
        this.note = note;
    }

}
