package com.example.schoolmanagementsystem;

import com.example.schoolmanagementsystem.entity.Student;
import com.example.schoolmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementSystemApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("olu","ola","ola@gmail.com");
//        studentRepository.save(student1);
//        Student student2 = new Student("bola", "bota", "bola@gmail.com");
//        studentRepository.save(student2);
//        Student student3 = new Student("lasisi","ezikiel","lasis@gmail.com");
//        studentRepository.save(student3);

    }
}
