package com.Aakib.portfolio_api.controller;

import com.Aakib.portfolio_api.model.Project;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProjectController {
    @GetMapping("/api/projects")
    public List<Project> getProjects(){
        return List.of(
                new Project(
                        "GEM FLOW",
                        "A gemstone business management and inventory SaaS platform.",
                        "Java, Spring Boot, React",
                        "https://github.com"
                ),
                new Project(
                        "Portfolio API",
                        "The backend powering this very portfolio site.",
                        "java, Spring Boot",
                        "https://github.com"
                )
        );
    }
}
