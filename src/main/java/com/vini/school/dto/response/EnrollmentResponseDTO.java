package com.vini.school.dto.response;

public class EnrollmentResponseDTO {

    private Long id;
    private String studentName;
    private String classroomName;

    public EnrollmentResponseDTO() {
    }

    public EnrollmentResponseDTO(Long id, String studentName, String classroomName) {
        this.id = id;
        this.studentName = studentName;
        this.classroomName = classroomName;
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
}