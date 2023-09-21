package com.orangehrm.utilities;

import com.orangehrm.constants.Constants;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcelUtility {
    public static XSSFWorkbook wb;
    public static XSSFSheet sh;
    public static FileInputStream f;

    public static List<String> readDataFromExcel(String sheetName) {
        List<String> excelRows = new ArrayList<>();
        try (FileInputStream f = new FileInputStream(System.getProperty("user.dir") + Constants.EXCEL_PATH);
             Workbook wb = new XSSFWorkbook(f)) {
            Sheet sh = wb.getSheet(sheetName);
            DataFormatter formatter = new DataFormatter();
            for (Row r : sh) {
                for (Cell c : r) {
                    excelRows.add(formatter.formatCellValue(c));
                }
            }
        } catch (
                IOException e) {
            throw new IllegalArgumentException("defined final not found");
        }
        return excelRows;
    }

    public static List<List<String>> excelDataReader(String sheetName) {

        DataFormatter formatter = new DataFormatter();
        try {
            f = new FileInputStream(System.getProperty("user.dir") + Constants.EXCEL_PATH);
            wb = new XSSFWorkbook(f);
        } catch (IOException e) {
            throw new IllegalArgumentException("defined final not found");
        }
        sh = wb.getSheet(sheetName);
        List<List<String>> excelRows = new ArrayList<>();
        int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
        for (int i = 0; i < rowCount + 1; i++) {
            int x = 0;
            Row row = sh.getRow(i);
            String[] columnList = new String[row.getLastCellNum()];
            for (int j = 0; j < columnList.length; j++) {
                columnList[j] = formatter.formatCellValue(row.getCell(x));
                x++;
            }
            excelRows.add(new ArrayList<>(Arrays.asList(columnList)));
        }
        return excelRows;
    }

    public static Object[][] dataProviderRead(String sheetName) {
        DataFormatter formatter = new DataFormatter();
        try {
            f = new FileInputStream(System.getProperty("user.dir") + Constants.DATAPROVIDEREXCEL_PATH);
            wb = new XSSFWorkbook(f);
            sh = wb.getSheet(sheetName);
            int rows = sh.getLastRowNum() + 1;
            int cols = sh.getRow(0).getLastCellNum();
            Object[][] data = new Object[rows][cols];
            for (int i = 0; i < rows; i++) {
                Row row = sh.getRow(i);
                String[] columnList = new String[row.getLastCellNum()];
                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);
                    data[i][j] = cell.getStringCellValue();
                }
            }
            return data;
        } catch (IOException e) {
            throw new IllegalArgumentException("defined final not found");
        }
    }
}
