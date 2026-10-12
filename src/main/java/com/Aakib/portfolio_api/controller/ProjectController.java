package com.Aakib.portfolio_api.controller;

import com.Aakib.portfolio_api.model.Project;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://aakib-portfolio-omega.vercel.app"})
public class ProjectController {
    @GetMapping("/api/projects")
    public List<Project> getProjects(){
        return List.of(
                new Project(
                        "CNN Skin Disease Classifier",
                        "Image classification model using MobileNetV2 transfer learning (70+% accuracy), served through a FastAPI REST API with a React frontend and containerized with Docker.",
                        "Python, TensorFlow/Keras, FastAPI, React, Docker",
                        "https://github.com/AakibFaiez/CNN-Skin-Disease-Classifier"
                ),
                new Project(
                        "Futsal Court Booking Platform",
                        "Full-stack booking system with JWT authentication, separate user and admin roles, and CRUD management for courts and tournaments.",
                        "MongoDB, Express, React, Node.js, JWT",
                        "https://github.com/AakibFaiez/Futsal-court-booking-website-Team-SE-93"
                ),
                new Project(
                        "Multithreaded Hospital Management System",
                        "Java simulation of a hospital workflow handling up to 100,000 concurrent patient submissions, using thread-safe queues so multiple consultants can work without data corruption.",
                        "Java, Multithreading, Concurrency",
                        "https://github.com/AakibFaiez"
                ),
                new Project(
                        "Maximum Flow Algorithm",
                        "Ford-Fulkerson implementation with file-based graph input and performance analysis across test cases.",
                        "Java, Graph Algorithms",
                        "https://github.com/AakibFaiez/Maximum-Flow-Algorithm"
                ),
                new Project(
                        "GemFlow (in progress)",
                        "A gemstone business management and inventory platform for tracking stones and sales, built as a Spring Boot REST API with a React frontend.",
                        "Java, Spring Boot, PostgreSQL, React",
                        "https://github.com/AakibFaiez"
                )
        );
    }
}
