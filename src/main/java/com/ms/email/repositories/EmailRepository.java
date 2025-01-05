package com.ms.email.repositories;

import com.ms.email.enums.StatusEmail;
import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
