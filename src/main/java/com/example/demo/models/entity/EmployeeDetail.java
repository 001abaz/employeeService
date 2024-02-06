package com.example.demo.models.entity;

import com.example.demo.models.enums.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_employee_detail")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class EmployeeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDateTime createdDate;
    @Column(name = "updated_date")
    LocalDateTime updatedDate;
    @Enumerated(EnumType.STRING)
    Status status;
    @ManyToOne
    Position position;
    @Column(name = "salary")
    int salary;
    @ManyToOne
    Employee employee;
    @Column(name = "experience")
    int experience;
    @Column(name = "join_date")
    LocalDate joinDate;


}
