package edu.springcore.config;

import edu.springcore.repository.StudentRepository;
import edu.springcore.repository.StudentRepositoryEmpl;
import edu.springcore.service.StudentService;
import edu.springcore.service.StudentServiceEmpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean(name = "studentService")
    public StudentService getStudentService(){
        StudentServiceEmpl studentServiceEmpl = new StudentServiceEmpl();
        studentServiceEmpl.setStudentRepository(getStudentRepository());
        return studentServiceEmpl;
    }

    public StudentRepository getStudentRepository(){
        return new StudentRepositoryEmpl();
    }
}
