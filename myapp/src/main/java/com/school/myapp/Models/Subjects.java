package com.school.myapp.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subjects {
    
    @Id
    private int idSubject;
    private String subject;
    private int idClass;
    
    public Subjects(String subject, int idClass) {
        this.subject = subject;
        this.idClass = idClass;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getIdClass() {
        return idClass;
    }
    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

}