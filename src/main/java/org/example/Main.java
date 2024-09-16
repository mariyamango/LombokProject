package org.example;

//Step 1: Add the Builder pattern to all entities and create additional objects with the Builder in the main method.
//Step 2: Use the With annotation to facilitate changing properties.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Berlin", 4.5);
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Tom");
        student2.setAddress("Munchen");
        student2.setGrade(5.3);
        Student student3 = new Student(3, "Jerry", "Berlin", 1.5);
        Student student4 = new Student(4, "Emma", "Hamburg", 1.8);
        Student student5 = student1;

        Teacher teacher1 = new Teacher(1, "Mr Brown", "Mathematics");
        Teacher teacher2 = new Teacher(2, "Mr Green", "Algebra");

        Course course1 = new Course(1, "Course1", teacher1, List.of(student1, student2));
        Course course2 = new Course(2, "Course2", teacher2, List.of(student3, student4));

        //Builder
        Student student6 = Student.builder()
                .id(6)
                .name("Anna")
                .address("Emden")
                .grade(3.5)
                .build();


        System.out.println(student6);

        //With

        Student student7 = student2.withName("Amanda");
        System.out.println(student7);


        System.out.println("student1.getName(): " + student1.getName());
        System.out.println("teacher1: " + teacher1);
        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student5): " + student1.equals(student5));

        University university = new University(1, "Best German Uni", List.of(course1, course2));
        System.out.println("Average course grade: " + UniversityService.averageCourseGrade(course1));
        System.out.println("Average uni grade: " + UniversityService.averageStudentGrade(university));
        System.out.println("Get students with minimum 2 grade: " + UniversityService.getStudentsByMinimalGrade(university, 2));
    }
}