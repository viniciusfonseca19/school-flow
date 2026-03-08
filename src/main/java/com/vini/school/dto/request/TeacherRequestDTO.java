package com.vini.school.dto.request;

public class TeacherRequestDTO {

    private String name;
    private String email;

    public TeacherRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}