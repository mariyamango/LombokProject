package org.example;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class Course {
    private int id;
    private String name;
    Teacher teacher;
    List<Student> students;
}
