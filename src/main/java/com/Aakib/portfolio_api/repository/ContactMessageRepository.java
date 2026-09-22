package com.Aakib.portfolio_api.repository;

import com.Aakib.portfolio_api.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
