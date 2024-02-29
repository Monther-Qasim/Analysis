package com.example.students.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "GPA")
    private long  GPA;

    @Column(name = "age")
    private long  age;

    public Student() {

    }

    public Student(String firstName, String lastName, String email,long GPA,long age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.GPA=GPA;
        this.age=age;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getGPA() {
        return GPA;
    }
    public void GPA(long GPA) {this.GPA = GPA;}
    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {this.age = age;}


    public void setGPA(Long gpa) {this.GPA = GPA;
    }


    public long getGpa() {return GPA;
    }
}
