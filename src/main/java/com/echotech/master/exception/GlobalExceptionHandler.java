package com.echotech.master.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.echotech.master.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleUserExists(BadRequestException ex) {

        ErrorResponse error = new ErrorResponse(
                "USER_ALREADY_EXISTS",
                ex.getMessage());

        return ResponseEntity.status(HttpStatus.CONFLICT)
                             .body(error);
    }

}
