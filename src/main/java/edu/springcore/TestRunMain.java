package edu.springcore;

import edu.springcore.config.ApplicationConfig;
import edu.springcore.model.Student;
import edu.springcore.service.StudentService;
import edu.springcore.service.StudentServiceEmpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestRunMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.getAll();
    }
}
