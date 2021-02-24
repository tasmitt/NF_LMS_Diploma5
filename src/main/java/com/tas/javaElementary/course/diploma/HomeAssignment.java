package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;
import java.util.*;

public class HomeAssignment {
    private String task;
    private LocalDate deadline;

    List<Homework> hw = new ArrayList<>();

    public HomeAssignment(String task, LocalDate deadline) {
        this.task = task;
        this.deadline = deadline;
    }

    public void addHomework(Homework homework){
        hw.add(homework);
    }

    public String getTask() {
        return task;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

}
