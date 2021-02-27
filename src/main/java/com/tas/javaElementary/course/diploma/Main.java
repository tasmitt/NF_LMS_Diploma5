package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("K", "L", LocalDate.of(1985,2,3));
        Group group = new Group("J", "Java", LocalDate.of(2021, 11, 11));

        group.addTeacher(teacher);
        teacher.addGroup(group);

        Student student1 = new Student("N","F", LocalDate.of(1990, 1,1));
        Student student2 = new Student("P","V", LocalDate.of(1995, 1,1));

        group.addStudent(student1);
        student1.assignGroup(group);
        group.addStudent(student2);
        student2.assignGroup(group);

        if (teacher.hasGroup()){
            System.out.println(teacher.getGroup(group).getStudents().toString());
        }

        Post post1 = new Post("Hello world", LocalDate.now());
        Post post2 = new Post("Great to see you again", LocalDate.now());

        group.getFeed().addPost(post1);
        group.getFeed().addPost(post2);

        System.out.println(teacher.getGroup(group).getFeed().getPosts().toString());

        Lesson lesson = new Lesson("Gener", LocalDate.of(2021, 2, 28));
        lesson.addMaterial("Some presentation");
        lesson.addHomeAssignment(new HomeAssignment("Some assignment",LocalDate.of(2021, 03, 01)));

        student1.getGroup().getLesson(lesson).getHomeAssignment().addHomework(new Homework(student1, "Something", LocalDate.now()));


    }
}
