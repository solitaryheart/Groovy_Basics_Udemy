package in.at.stringdemo

class StringDemo {

    static main(args){

        //Java Strings

        String strLiteral = "This is String Literal"
        println strLiteral

        //String is a own class in Java
        String strNew = new String("This is using new keyword")
        println strNew

        //Groovy Strings

        //************** SINGLE QUOTE *******************

        //Multiline not possible//

        def singleQuoteString = 'This is a Single Quote String' +
                'This a new line'

        println("Single Quote String : "+singleQuoteString)

        //************** TRIPLE SINGLE QUOTE *******************

        //Multiline possible//
        //Ecape character "\"
        //does not support interpolation
        def tripleSingleQuoteString = '''\
This is a Triple Single Quote String
This is new line'''
        println("Triple Single Quote String: "+tripleSingleQuoteString)


        //************** DOUBLE QUOTE *******************

        //Multiline not possible//
        //Ecape character "\"
        //does  support interpolation


        def sampleData = " Groovy"

        //Interpolation -> inside the string !!
        def doubleQuote ="This is double Quote String ${sampleData}"
        println(doubleQuote)

        //************** TRIPLE DOUBLE QUOTE *******************

        //Multiline  possible//
        //Ecape character "\"
        //does  support interpolation

        def tripleDoubleQuote = """This is a Triple Double Quote String
This a new Line for Triple Double Quote
${sampleData}"""
        println(tripleDoubleQuote)


        //************** SLASHY QUOTE *******************

        //Multiline  possible//
        //Ecape character "\"
        //does  support interpolation

        def slashyString = /This is a Slashy String
This is an new slashy string line
${sampleData}/

        println(slashyString)

        //************** DOLLAR SLASHY QUOTE *******************

        //Multiline  possible//
        //Ecape character "$"
        //does  support interpolation

        def dollarSlashyString = $/This is a dollar slashy String/
This is a new line for dollar slashy
${sampleData} /$

        println(dollarSlashyString)







    }
}
