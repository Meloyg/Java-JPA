package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student melo = new Student(
                    "Melo Guan",
                    LocalDate.of(2000, Month.MAY, 25),
                    "meloguan123@gmail.com"
            );

            Student li = new Student(
                    "Li",
                    LocalDate.of(2000, Month.MAY, 25),
                    "3@gmail.com"
            );

            studentRepository.saveAll(
                    List.of(melo, li)
            );
        };
    }
}
