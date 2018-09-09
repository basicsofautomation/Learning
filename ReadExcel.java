package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        ReadExcel rd = new ReadExcel();
        String filepath = System.getProperty("user.dir")+"\\src\\test\\java\\resource";
        rd.readExcel(filepath,"ExportExcel.xlsx","ExcelGuru99Demo");
    }

    public void readExcel(String filePath,String fileName,String sheetName){

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        System.out.println("rowcount is: "+rowCount);

        for(int  i=0; i<=rowCount;rowCount++)
        {
            Row row = sheet.getRow(i);
            System.out.println("Row is:"+ row);
        }

       /* FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(filePath+"\\"+fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook=null;
        try {
             workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = workbook.getSheet(sheetName);
        int rowcount = sheet.getFirstRowNum()-sheet.getLastRowNum();
        for(int i=0;i<=rowcount;i++)
        {
            Row row =sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++){
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
            }

            System.out.println();
        }*/
    }

}
