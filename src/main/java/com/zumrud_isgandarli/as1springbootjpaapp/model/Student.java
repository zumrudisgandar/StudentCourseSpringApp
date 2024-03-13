package com.zumrud_isgandarli.as1springbootjpaapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "student"
)
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int studentID;
    @Column(
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            columnDefinition = "TEXT"
    )
    private String lastName;
    @Column(
            columnDefinition = "TEXT"
    )
    private String major;
    private int graduationYear;
    private double cgpa;

    public Student(int studentID, String firstName, String lastName, String major, int graduationYear, double cgpa) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.graduationYear = graduationYear;
        this.cgpa = cgpa;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGraduationYear() {
        return this.graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public double getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Student{studentID=" + this.studentID + ", firstName='" + this.firstName + "', lastName='" + this.lastName + "', major='" + this.major + "', graduationYear=" + this.graduationYear + ", cgpa=" + this.cgpa + "}";
    }
}