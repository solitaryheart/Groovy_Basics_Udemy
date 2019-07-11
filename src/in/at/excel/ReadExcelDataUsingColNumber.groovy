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

class ReadExcelDataUsingColNumber {

    static main(args){

        def fis = new FileInputStream("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        //Reading first User Name and get as String value
        def row = sheet.getRow(1)
        def cell = row.getCell(0)
        def userName = cell.getStringCellValue()
        println("Username from Excel sheet is:  $userName")

        //Reading first Password and get as String value
        cell = row.getCell(1)
        def passWord = cell.getStringCellValue()
        println("Password from Excel sheet is:  $passWord")

        //Reading first Date and get as String value
        cell = row.getCell(2)
        def dateCreated = cell.getDateCellValue()
        println("Date from Excel sheet is:  $dateCreated")

        //returns -> Sun Jan 01 00:00:00 CET 2017
        //will be formated later by UtilityClass

        //Reading first numberOfAttempts
        cell = row.getCell(3)
        int numberOfAttempts = cell.getNumericCellValue()
        println("Password from Excel sheet is:  $numberOfAttempts")

        println("-------------------------------")
        //def eat = new ExcelAPITest("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")
        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")


        println("First User in Row 1 is: ")

        userName = eat.getCellData("Credentials",1,2)
        println("UserName from Excel Sheet is: $userName")

        passWord = eat.getCellData("Credentials",2,2)
        println("UserName from Excel Sheet is: $passWord")

        dateCreated = eat.getCellData("Credentials",3,2)
        println("Date from Excel Sheet is: $dateCreated")


    }
}
