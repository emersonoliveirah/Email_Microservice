package com.ms.email.dtos;

import java.util.UUID;

public record EmailRecordDto(UUID userId,
                             String emailFrom,
                             String emailTo,
                             String subject,
                             String text) {
}
