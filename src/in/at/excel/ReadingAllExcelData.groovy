package in.at.excel

/*
COLUMNS - NAMES AND NUMBERS ZERO BASES
  - UserName            0
  - Password            1
  - DateCreated         2
  - NoOfAtttempts       3
 */

class ReadingAllExcelData {

    static main(args){

        def eat = new ExcelAPITest("C:\\udemy\\Groovy\\8_Apache_POI_Excel\\1_Get_Row_And_Column_Count\\TestData.xlsx")

        //Getting Row and Column Count



        int colCount = eat.getColumnCount("Credentials")
        int rowCount = eat.getRowCount("Credentials")
        println("Column count is : ${eat.getColumnCount("Credentials")}")
        println("Row count is : ${eat.getRowCount("Credentials")}")

        for(def i in 2..rowCount){

            def userName = eat.getCellData("Credentials",1,i)
            println("UserName from Excel Sheet is: $userName")

            def passWord = eat.getCellData("Credentials",2,i)
            println("Password from Excel Sheet is: $passWord")

            def dateCreated = eat.getCellData("Credentials",3,i)
            println("Date from Excel Sheet is: $dateCreated")

            int numberofAttempts = eat.getCellData("Credentials",4,i)
            println("Attempt number from Excel Sheet is: $numberofAttempts")

        }

    }
}
