package com.example.demo.service.impl;

import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.models.entity.Employee;
import com.example.demo.service.ExcelService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {
    @Override
    public byte[] generateEmployeesListExcel(List<EmployeeExcelDto> dto) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet java");

        Row headerRow = sheet.createRow(0);

        List<String> staticData = List.of("№", "Name", "Surname", "Middle Name", "Birth Date", "Phone", "Position", "Department", "Salary", "Join Date");
        List<Integer> widthsHeaderRow = List.of(1000, 3000, 3000, 3000, 2000, 4000, 4000, 4000, 3000, 6000);

        for (int i = 0; i < staticData.size(); i++) {
            cellCreator(workbook, sheet,headerRow, staticData.get(i), i, widthsHeaderRow.get(i));
        }



        // out
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            workbook.write(out);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return out.toByteArray();
    }

    private void cellCreator(XSSFWorkbook workbook, Sheet sheet ,Row row, String value, int index, int width, empValue) {

        sheet.setColumnWidth(index, width);

        Font font = workbook.createFont();
        font.setBold(true);

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);

        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Cell cell = row.createCell(index);
        cell.setCellValue(width);
        cell.setCellStyle(cellStyle);
    }


}
