package org.example;

import java.util.List;

//Find out what the Lombok annotation @Value does and use it for the Course class.
//
//Create a record University with the following attributes: id, name, courses.
//
public record University(int id, String name, List<Course> courses) {
}
