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

class ReadExcelDataUsingColName {

    static main(args){

        def fis = new FileInputStream("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")


        //first row contains always colums headers
        def row = sheet.getRow(0)

        //initalize variable columNumber
        def colNum

        //Loop until colNum of provided Column-Name is found

        for(i in 0..row.getLastCellNum() - 1){
            if(row.getCell(i).getStringCellValue().trim() == "UserName")
                colNum = i
        }

        row = sheet.getRow(1)
        def cell = row.getCell(colNum)

        def userName = cell.getStringCellValue()
        println("UserName from Excel is: $userName")


       println(" -------------------------------------------------------------")

        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")

        userName = eat.getCellData("Credentials","UserName",2)
        println("UserName from Excel is: $userName")

        def passWord = eat.getCellData("Credentials","Password",3)
        println("UserName from Excel is: $passWord")



        int noOfAttempts = eat.getCellData("Credentials","NoOfAttempts",2)
        println("Number of Attempts from Excel is: $noOfAttempts")


        def dateCreated  = eat.getCellData("Credentials","DateCreated",3)
        println("Number of Attempts from Excel is: $dateCreated ")




    }
}
