package edu.springcore.service;


import edu.springcore.model.Student;
import edu.springcore.repository.StudentRepository;
import edu.springcore.repository.StudentRepositoryEmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class StudentServiceEmpl implements StudentService{

    /*//Day la hard code: no se dung ham khoi tao khong tham so.
    //Chung ta khong muon hard code;
    //Nen se su dung Spring bean
    private StudentRepository studentRepository = new StudentRepositoryEmpl();*/

    @Autowired
    private StudentRepository studentRepository;

    //Cach su dung Setter Injection
    public StudentRepository getStudentRepository() {
        System.out.println("Getter studentRepository");
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter studentRepository");
        this.studentRepository = studentRepository;
    }

    //Cach su dung Constructor Injection


    public StudentServiceEmpl() {
        System.out.println("Constructor no param");
    }

    public StudentServiceEmpl(StudentRepository studentRepository) {
        System.out.println("Construct has a param");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll(){
        return studentRepository.getAll();
    }

}
