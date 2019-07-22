package edu.springcore.repository;

import edu.springcore.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryEmpl implements StudentRepository{


    @Override
    public List<Student> getAll(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack"));
        return students;
    }
}
