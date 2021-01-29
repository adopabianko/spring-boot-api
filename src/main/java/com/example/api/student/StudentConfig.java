package com.example.api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ado = new Student(
                    "Ado Pabianko",
                    "adopabianko@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 6)
            );

            Student naufal = new Student(
                    "Naufal Hibatullah",
                    "naufalhibatullah@gmail.com",
                    LocalDate.of(1995, Month.DECEMBER, 21)
            );

            Student sarah = new Student(
                    "Sarah Salsabila",
                    "sarahsalsabila@gmail.com",
                    LocalDate.of(2003, Month.AUGUST, 28)
            );

            repository.saveAll(List.of(ado, naufal, sarah));
        };
    }
}
