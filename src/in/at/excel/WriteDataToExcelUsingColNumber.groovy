package in.at.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

/*
  COLUMNS - NAMES AND NUMBERS ZERO BASES
  - UserName            0
  - Password            1
  - DateCreated         2
  - NoOfAtttempts       3


  Data:

Username from Excel sheet is:  AdminUser
Password from Excel sheet is:  admin@123
Date from Excel sheet is:  Sun Jan 01 00:00:00 CET 2017
Password from Excel sheet is:  10

 */

class WriteDataToExcelUsingColNumber {

    static main(args){
        def fis = new FileInputStream("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(1)

        if (row == null){
            row = sheet.createRow(1)
        }

        def cell = row.getCell(4)

        if (cell == null){
            cell = row.createCell(4)
        }

        //setting the value
        cell.setCellValue("PASS")

        //declaring file output stream

        def fos = new FileOutputStream("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
        //save data in workbook

        workbook.write(fos)
        fos.close()

        println("Success")

        println("-----------------------------------------------------------------")

        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
        eat.setCellData("Credentials",4,2,"pass")
        eat.setCellData("Credentials",4,3,"wichs")
        println("success")
    }
}
