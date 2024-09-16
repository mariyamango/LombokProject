package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private double grade;
}
