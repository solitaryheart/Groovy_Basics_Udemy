package in.at.excel

import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.DateUtil
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import java.io.FileInputStream
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import java.text.DateFormat
import java.text.SimpleDateFormat


/*
Utility class to provide methods for read and write in Excel

def fis = new FileInputStream("/KRISHNA VOLUME/Groovy_Udemy/src/in/at/files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)


        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(0)

        def colCount = row.getLastCellNum()

        println("Column Count is : $colCount")

        def rowCount = sheet.getLastRowNum() + 1

        println("Row Count is : $rowCount")







 */

class ExcelAPITest {

    // needed classes
    XSSFWorkbook workbook = null
    XSSFSheet sheet = null
    XSSFRow row = null
    XSSFCell cell = null
    def xlFilePath
    FileInputStream fis = null



    //creating a paramterised constructor

    def ExcelAPITest(xlFilePath){

        this.xlFilePath = xlFilePath
        fis = new FileInputStream(xlFilePath)
        workbook = new XSSFWorkbook(fis)


    }

    //methods

    def getRowCount(sheetName){
       sheet = workbook.getSheet(sheetName)
        sheet.getLastRowNum() + 1

    }

    def getColumnCount(sheetName){
        sheet = workbook.getSheet(sheetName)
        row = sheet.getRow(0)
        row.getLastCellNum()
    }

    def getCellData(sheetName, int colNum, rowNum){
        try {
            def cellValue

            sheet = workbook.getSheet(sheetName)
            //if user doesn't provide index-based values
            row = sheet.getRow(rowNum - 1)
            cell = row.getCell(colNum - 1)

            switch (cell.cellTypeEnum) {
                case CellType.STRING:
                    cellValue = cell.getStringCellValue()
                    break
                case { CellType.NUMERIC || CellType.FORMULA }:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy")
                        Date date = cell.getDateCellValue()
                        cellValue = df.format(date)
                    } else {
                        cellValue = cell.getNumericCellValue()
                    }
                    break
                case CellType.BLANK:
                    cellValue = ""
                    break

                default:
                    cellValue = cell.getBooleanCellValue()
                    break
            }

            cellValue

        }
        catch (Exception e) {
            e.printStackTrace()
            "row $rowNum or colNum $colNum does not exist in the excel."
        }
    }







    }






