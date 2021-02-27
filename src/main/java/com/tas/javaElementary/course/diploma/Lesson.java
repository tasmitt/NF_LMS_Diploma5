package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lesson {
    private String topic;
    private LocalDate date;
    private ArrayList materials = new ArrayList();
    private HomeAssignment homeAssignment;

    public Lesson(String topic, LocalDate date) {
        this.topic = topic;
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList getMaterials() {
        return materials;
    }

    public HomeAssignment getHomeAssignment() {
        return homeAssignment;
    }

    public void addMaterial(Object material) {
        this.materials.add(material);
    }

    public boolean addHomeAssignment(HomeAssignment homeAssignment) {
        if (this.homeAssignment == null) {
            this.homeAssignment = homeAssignment;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAssignment() {
        return homeAssignment == null;
    }

}
