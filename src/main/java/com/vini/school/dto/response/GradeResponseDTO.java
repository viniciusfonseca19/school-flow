package com.vini.school.dto.response;

public class GradeResponseDTO {

    private Long id;
    private String studentName;
    private String classroomName;
    private Double value;

    public GradeResponseDTO() {
    }

    public GradeResponseDTO(Long id, String studentName, String classroomName, Double value) {
        this.id = id;
        this.studentName = studentName;
        this.classroomName = classroomName;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public Double getValue() {
        return value;
    }
}