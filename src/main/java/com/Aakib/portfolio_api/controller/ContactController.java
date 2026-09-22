package com.Aakib.portfolio_api.controller;

import com.Aakib.portfolio_api.model.ContactMessage;
import com.Aakib.portfolio_api.repository.ContactMessageRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {
    private final ContactMessageRepository repository;

    public ContactController (ContactMessageRepository repository){
        this.repository= repository;
    }

    @PostMapping("/api/contact")
    public ContactMessage submitContact (@Valid @RequestBody ContactMessage contactMessage){
        return repository.save(contactMessage);
    }
    @GetMapping("/api/contact")
    public List<ContactMessage> getAllMessages(){
        return repository.findAll();
    }

}
