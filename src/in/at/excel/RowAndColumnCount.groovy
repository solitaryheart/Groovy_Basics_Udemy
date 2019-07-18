package in.at.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook




/* -> here for demonstration -> Standalone programm
-> better choice create a utility class
 */

class RowAndColumnCount {

    static main(args){

        def fis = new FileInputStream("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(0)

        def colCount = row.getLastCellNum()

        println("Column Count is : $colCount")

        def rowCount = sheet.getLastRowNum() + 1

        println("Row Count is : $rowCount")

        println("---------------------------------")


        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")

        println("Column Count is : ${eat.getColumnCount("Credentials")}")
        println("Row Count is : ${eat.getRowCount("Credentials")}")


    }
}