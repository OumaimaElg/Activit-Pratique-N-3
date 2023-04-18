package com.example.atelier3;

import com.example.atelier3.entities.Patient;
import com.example.atelier3.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
public class Atelier3Application {

    public static void main(String[] args) {
        SpringApplication.run(Atelier3Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Oumaima",new Date(), false,12));
            patientRepository.save(new Patient(null,"Siham",new Date(), true,20));
            patientRepository.save(new Patient(null,"Rania",new Date(), false,13));
            patientRepository.save(new Patient(null,"Maha",new Date(), true,5));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });

        };
    }
}
