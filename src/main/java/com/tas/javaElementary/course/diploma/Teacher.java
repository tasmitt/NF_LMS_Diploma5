package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User{
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private List<Group> groups = new ArrayList<>();

    public Teacher(String firstName, String lastName, LocalDate dateOfBirth) {
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

    public List<Group> getGroups() {
        return groups;
    }

    public boolean addGroup(Group group){
        return this.groups.add(group);
    }

    public boolean removeGroup(Group group){
        return this.groups.remove(group);
    }

    public int numberOfGropus(){
        return groups.size();
    }

    public boolean hasGroup(Group group){
        return groups.contains(group);
    }
}
