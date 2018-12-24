package ru.krivonos.project.models;

import java.util.Date;
import java.util.List;

public class Project {

    public int id;

    private String name;

    private final Date dateOfCreation;

    private String description;

    private List<ProjectStatistics> statistics;

    public Project() {
        dateOfCreation = new Date();
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProjectStatistics> getStatistics() {
        return statistics;
    }

    public void addStatistics(ProjectStatistics projectStatistics) {
        statistics.add(projectStatistics);
    }
}
