package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;

public class Homework {
    private String materials;
    private LocalDate date;
    private Student student;

    public Homework(Student student,String materials, LocalDate date) {
        this.materials = materials;
        this.date = date;
        this.student = student;
    }

    public String getMaterials() {
        return materials;
    }

    public LocalDate getDate() {
        return date;
    }
}
