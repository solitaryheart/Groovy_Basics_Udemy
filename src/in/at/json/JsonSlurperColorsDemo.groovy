package in.at.json

import groovy.json.JsonSlurper

class JsonSlurperColorsDemo {

    static main(args){

        def jsonFile = new File("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\colors.json").text
        def jsonSlurper = new JsonSlurper()
        def content = jsonSlurper.parseText(jsonFile)

        //declaring an empty list
        def hexCodeList = []
        def typeContent =  []

        //Printing all color codes
        println(content.colors.code.hex)

        //Printing each color codes and store in list

        content.colors.each{
            println(it.code.hex)
            hexCodeList << it.code.hex
        }

        println(hexCodeList)

        //Printing index 0 element from list
        println(hexCodeList[0])

        //Printing all types
        println(content.colors.type)

        content.colors.each{
            println(it.type)
            hexCodeList << it.code.hex
        }

        println(hexCodeList)
        println(typeContent)








    }


}
