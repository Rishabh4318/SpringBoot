package com.example.SpringTestProject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails{
    private LocalDate timeStamp;
    String message;
    String details;
}
