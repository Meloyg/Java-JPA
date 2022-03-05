package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {

    public List<Student> getStudentInfo() {
        return List.of(
                new Student(
                        1L,
                        "Melo Guan",
                        21,
                        LocalDate.of(2000, Month.MAY, 25),
                        "meloguan123@gmail.com"
                )
        );
    }
}
