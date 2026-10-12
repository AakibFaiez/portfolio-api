package com.Aakib.portfolio_api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://aakib-portfolio-omega.vercel.app"})
public class ProfileController {

    @GetMapping("/api/profile")
    public Map<String,String> getProfile(){
        return Map.of(
                "name", "Aakib Faiez",
                "title","Full Stack Engineer",
                "bio","Software Engineering undergraduate at IIT (University of Westminster) who builds full-stack applications, from Java concurrency projects to REST APIs and React frontends. I've worked across Java, Python, and the MERN stack, and I'm currently building a Spring Boot and React platform for gemstone business management. Looking for an internship where I can grow as a backend/full-stack engineer."


        );
    }
}
