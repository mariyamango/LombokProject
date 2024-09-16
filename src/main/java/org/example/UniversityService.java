package org.example;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class UniversityService {
    public static double averageCourseGrade(Course course) {
        return course.getStudents().stream().mapToDouble(Student::getGrade).average().orElse(0);
    }

    public static double averageStudentGrade(University university) {
        return university
                .courses()
                .stream()
                .flatMap(
                        course -> course.getStudents().stream()
                )
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }

    public static List<Student> getStudentsByMinimalGrade(University university, double minGrade) {
        return university
                .courses()
                .stream()
                .flatMap(
                        course -> course.getStudents().stream()
                )
                .filter(
                        student -> student.getGrade() < minGrade
                )
                .toList();
    }
}
