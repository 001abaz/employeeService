package com.example.demo.models.request;

import com.example.demo.models.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeCreateRequest {


    String name;
    String lastname;
    String middleName;
    String birthDate;
    String tin;
    Gender gender;
    String phone;
    String email;

}
