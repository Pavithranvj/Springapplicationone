package com.example.springappone;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springappone.entity.Usermodel;
import com.example.springappone.repository.UserRepository;

@Component
public class Dataseeder implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String ...args) throws Exception{
        if (userRepository.count() == 0) {
            List<Usermodel> usermodels = Arrays.asList(
                new Usermodel("pavithran",20,"Rasipuram",637462508),
                new Usermodel("Mohan Raj",20,"Namakkal",638461787)
            );
            userRepository.saveAll(usermodels);
            System.out.println("Demo data deeded");
        }
    }
}
