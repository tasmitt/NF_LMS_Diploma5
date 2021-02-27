package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;

public class Student extends User {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private Group group;

    public Student(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Group getGroup() {
        return group;
    }

    public boolean assignGroup( Group group){
        if (this.group == null){
        this.group = group;
        return true;
        } else {
            return false;
        }
    }

    public boolean rwmoveGroup(){
        if (this.group != null){
            this.group = null;
            return true;
        } else {
            return false;
        }
    }
}