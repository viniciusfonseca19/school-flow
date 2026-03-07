package com.vini.school.service;

import com.vini.school.entity.Enrollment;
import com.vini.school.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentById(Long id) {
        return enrollmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Enrollment não encontrado"));
    }

    public Enrollment updateEnrollment(Long id, Enrollment enrollment) {
        Enrollment existingEnrollment = enrollmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Enrollment não encontrado"));

        existingEnrollment.setStudent(enrollment.getStudent());
        existingEnrollment.setClassroom(enrollment.getClassroom());
        existingEnrollment.setEnrollmentDate(enrollment.getEnrollmentDate());

        return enrollmentRepository.save(existingEnrollment);
    }

    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }
}