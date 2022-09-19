package com.example.SpringTestProject.dto.User;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class User {
    @Size(min =2)
    @JsonProperty("user_name")
    private String name;
    @Past
    @JsonProperty("date_Of_birth")
    private LocalDate dob;
    private Integer id;
}
