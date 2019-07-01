package in.at.json

import groovy.json.JsonSlurper

class JsonSlurperPersonDemo {

    static main(args){

        def jsonFile = new File("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\person.json").text
        def jsonSlurper = new JsonSlurper()
        def personData = jsonSlurper.parseText(jsonFile)

        //Printing all values without structure

        println(personData.id)
        println(personData.name.first_name)
        println(personData.name.last_name)
        println(personData.email)
        println(personData.gender)
        println(personData.ip_address)

        //Printing each person id
        println("----------------")
        personData.each{
            println(it.id)
        }

        println("----------------")

        //Getting size of element name
        println(personData.name.size())

        println("----------------")

        println(personData.name.first_name[2])
        println(personData.name[2].first_name)

        println("----------------")

        println(personData.name[0].last_name)

    }
}
