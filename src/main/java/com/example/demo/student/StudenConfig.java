package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;


import static java.time.Month.*;

@Configuration
public class StudenConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "marian.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );
            Student alex = new Student(
                    1L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2014, JANUARY, 5),
                    21
            );
            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
