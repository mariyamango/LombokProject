package org.example;

import lombok.*;

import java.util.List;

@Value
public class Course {
    private int id;
    private String name;
    Teacher teacher;
    List<Student> students;
}
