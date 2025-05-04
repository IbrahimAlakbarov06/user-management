package turing.edu.az.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ErrorResponse {
    private UUID requestId;
    private String errorCode;
    private String errorMessage;
    private LocalDateTime timeStamp;
}