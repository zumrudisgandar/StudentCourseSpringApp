package com.zumrud_isgandarli.as1springbootjpaapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "course"
)
public class Course {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int courseID;
    @Column(
            columnDefinition = "TEXT"
    )
    private String title;
    @Column(
            columnDefinition = "TEXT"
    )
    private String availableTerm;
    @Column(
            columnDefinition = "TEXT"
    )
    private String gradingMethod;
    private int credits;

    public Course(int courseID, String title, String availableTerm, String gradingMethod, int credits) {
        this.courseID = courseID;
        this.title = title;
        this.availableTerm = availableTerm;
        this.gradingMethod = gradingMethod;
        this.credits = credits;
    }

    public int getCourseID() {
        return this.courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvailableTerm() {
        return this.availableTerm;
    }

    public void setAvailableTerm(String availableTerm) {
        this.availableTerm = availableTerm;
    }

    public String getGradingMethod() {
        return this.gradingMethod;
    }

    public void setGradingMethod(String gradingMethod) {
        this.gradingMethod = gradingMethod;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString() {
        return "Course{courseID=" + this.courseID + ", title='" + this.title + "', availableTerm='" + this.availableTerm + "', gradingMethod='" + this.gradingMethod + "', credits=" + this.credits + "}";
    }
}