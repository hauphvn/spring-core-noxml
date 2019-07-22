package edu.springcore.repository;

import edu.springcore.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    List<Student> getAll();
}
