package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private String direction;
    private LocalDate startDate;

    private List<Student> students= new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
    private Feed feed = new Feed();


    public Group(String name, String direction, LocalDate startDate) {
        this.name = name;
        this.direction = direction;
        this.startDate = startDate;
    }

    public boolean isFull(){
       return students.size() > 16;
    }

    public boolean enoughStudents(){
        return students.size() > 10;
    }

    public boolean addTeacher(Teacher teacher){
        return teachers.add(teacher);
    }

    public boolean hasTeacher(){
        return teachers.size() > 1;
    }

    public boolean addStudent(Student student){
        if (!isFull()) {
          return students.add(student);
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public LocalDate getStartDate() {
        return startDate;
    }


    public Feed getFeed(){
        return feed;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public boolean addLesson(Lesson lesson) {
        return this.lessons.add(lesson);
    }

    public Lesson getLesson(Lesson lesson) {
        int index = lessons.indexOf(lesson);
        return this.lessons.get(index);
    }
}
