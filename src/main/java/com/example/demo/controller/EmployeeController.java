package com.example.demo.controller;

import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.models.request.EmployeeCreateRequest;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ExcelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/va/employee")
public class EmployeeController {

    private final EmployeeService service;
    private final ExcelService excelService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody EmployeeCreateRequest request) {

        EmployeeDto dto = service.create(request);

        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/xlsx")
    public ResponseEntity<?> employeesInXlsx() {

        byte[] excelDocument = excelService.generateEmployeesListExcel();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "employeeList.xlsx");

        return ResponseEntity.ok().headers(headers).body(excelDocument);
    }

}
