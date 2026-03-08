package com.vini.school.dto.request;

public class CourseRequestDTO {

    private String name;
    private String description;

    public CourseRequestDTO() {
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
}