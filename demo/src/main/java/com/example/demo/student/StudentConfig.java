package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ahmed = new Student("ahmed","ahmed@gmail.com", LocalDate.of(2000,5,1));
            Student ayman = new Student("ayman","ayman@gmail.com", LocalDate.of(2002,5,1));

            repository.saveAll(
                    List.of(ahmed,ayman)
            );
        };
    }
}
