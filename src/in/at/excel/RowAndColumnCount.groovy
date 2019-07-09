package in.at.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook




/* -> here for demonstration -> Standalone programm
-> better choice create a utility class
 */

class RowAndColumnCount {

    static main(args){
       /* def fis = new FileInputStream("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")

        //reference workbook
        def workbook = new XSSFWorkbook(fis)

        //reference sheet
        def sheet = workbook.getSheet("Credentials")

        //to find column count first go to row with headings !

        def row = sheet.getRow(0)

        //Columnn count = last cell number in row 0 = Headings

        def colCount = row.getLastCellNum()

        //Printing Column count
        println("Column count is : $colCount")

        //Get RowCount

        def rowCount = sheet.getLastRowNum() +1

        println("Row count is : $rowCount")*/

        println("---EXCEL UTIL CLASS IN ACTION---------")

        //def eat = new ExcelAPITest("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")
        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\TestData.xlsx")

        println("Column count is : ${eat.getColumnCount("Credentials")}")
        println("Column count is : ${eat.getRowCount("Credentials")}")




    }
}
