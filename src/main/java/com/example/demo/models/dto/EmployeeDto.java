package com.example.demo.models.dto;

import com.example.demo.models.enums.Gender;
import com.example.demo.models.enums.Status;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDto {

    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Status status;
    String name;
    String lastname;
    String middleName;
    LocalDate birthDate;
    String tin;
    Gender gender;
    String phone;
    String email;
}
