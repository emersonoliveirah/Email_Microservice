package com.ms.email.dtos;

import java.util.UUID;

public record EmailRecordDTO(UUID userId,
                             String emailFrom,
                             String emailTo,
                             String subject,
                             String text) {
}
