package in.at.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class WriteDataToExcelUsingColName {

    static main(args){

        def fis = new FileInputStream("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def colNum = 1

        def row = sheet.getRow(0)

        //Searching for RowName "Result"
        for (i in 0..row.getLastCellNum() -1) {
            if (row.getCell(i).getStringCellValue().trim() == "Result")
                colNum = i
        }

            row = sheet.getRow(1)

            if(row ==null)
                row = sheet.createRow(1)

            def cell = row.getCell(colNum)

            if(cell ==null)
                cell = row.createCell(colNum)

            cell.setCellValue("Arsch")

            def fos = new FileOutputStream("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
            workbook.write(fos)
            fos.close()

            println("Success")

            println("-----------------")

        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
        eat.setCellData("Credentials","Result",3,"PASS")
        eat.setCellData("Credentials","Result",3,"AASS")

        println("Sucess...")



        }
    }

