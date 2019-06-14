package in.at.collections

/*
- Map is a collection of key/value pairs
- each key and value pair is known as entry
- Map contains only unique keys
- Retrieving the value be using key in Maps
- Map does not allow duplicate keys but duplicate values (Key/Value)
- Map can have single key at most any number of null values
- Map also does not store elements in an order

 */

class MapDemo {

    static main(args){

        //Declaring a map
        def emptyMap = [:]
        println("The Map values are : $emptyMap")

        def sampleMap = [language:"Groovy",categroy:"Programming"]
        println(sampleMap)

        //Adding value to Map
        sampleMap.put("Popularity","Super")
        println(sampleMap)

        sampleMap << [Licence:"Apache"]
        println(sampleMap)

        //Retrieve the values from Map
        println(sampleMap.get("Popularity"))
        println(sampleMap["language"])
        println(sampleMap.categroy)
        println(sampleMap."Licence")

        //Replace values
        sampleMap['language'] = "Java"
        println(sampleMap)

        sampleMap.put("language","R")
        println(sampleMap)

        sampleMap << [language: "Groovy"]
        println(sampleMap)

        //Remove values

        /*sampleMap = sampleMap - [categroy: "Programming"]
        println(sampleMap)

        sampleMap.remove("language")
        println(sampleMap)

        sampleMap -=[Popularity: "Super"]
        println(sampleMap)*/

        //Size of the Map
        println("The size of the Map is: ${sampleMap.size()}")

        //Get all Values fom Map as list
        def allValues = sampleMap.values()
        println(allValues)

        //Get all Keys from Map as list
        def allKeys = sampleMap.keySet()
        println(allKeys)

        //adding duplicate values - can nir add duplicate values
        sampleMap << [categroy: "Progamming"]
        println(sampleMap)

        //print Map using for loop -> does not work in MAP !
        /*for (int i = 0; i<= sampleMap.size(); i++){
            println(sampleMap[i])
        }*/

        //Print Map using loop

        sampleMap.each {
            println(it)
        }

        
        for(def map : sampleMap.keySet()){
            println(map)
        }








    }
}
