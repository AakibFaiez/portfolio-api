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
                "name", "Aakib",
                "title","java & springBoot Developer",
                "bio","Building backend Projects."


        );
    }
}
