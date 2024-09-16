package org.example;

//Step 1: Add the Lombok dependency to your project and configure IntelliJ to support Lombok.
//Step 2: Create a simple class "Student" with the following attributes: id, name, address, grade.
//Step 2.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
//Step 3: Create a Teacher record with the following attributes: id, name, subject.
//Step 4: Create a class Course with the following attributes: id, name, teacher, students.
//Step 4.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
//Step 5: Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
//Step 6: In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...).

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "John", "Berlin",4.5);
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Tom");
        student2.setAddress("Munchen");
        student2.setGrade(5.3);
        Student student3 = new Student(3, "Jerry", "Berlin",3.5);
        Student student4 = new Student(4, "Emma", "Hamburg",3.8);
        Student student5 = student1;

        Teacher teacher1 = new Teacher(1,"Mr Brown","Mathematics");
        Teacher teacher2 = new Teacher(2,"Mr Green","Algebra");

        Course course1 = new Course(1,"Course1",teacher1, List.of(student1,student2));
        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Course2");
        course2.setTeacher(teacher2);
        course2.setStudents(List.of(student3,student4));

        System.out.println("student1.getName(): " + student1.getName());
        System.out.println("teacher1: " + teacher1);
        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student5): " + student1.equals(student5));
    }
}