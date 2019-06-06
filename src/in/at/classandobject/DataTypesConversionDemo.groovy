package in.at.classandobject

import java.sql.DriverManager

class DataTypesConversionDemo {

    static main(args){

        //Conversion into desired datatyp; Keyword ="As"
        def charValue = 65 as char
        println(charValue)

        def strNumber = "100" as int

        def a = strNumber + 10
        println(a)

        def doubleValue = 10.125411566425 as float
        println(doubleValue)


    }
}
