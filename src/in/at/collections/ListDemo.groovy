package in.at.collections

/*
 - data structure to store a collection of data
 - used to store varying amount of data where the number of items is
   determined at run time
 - can be used to store large amounts of data
 - can store duplicate values
 - allows positional access an insertion of elements

 */

class ListDemo {

    static main(args){

        // Declaration -> "as List"
        def languages = ["Groovy", "Java","Python"] as List

        //Printing List-Collection
        println(languages)

        //Size of the List
        def languagesSize = languages.size()

        println("The size of list is : $languagesSize")
        println("The size of list is : ${languages.size()}")

        //Retrieve value from list
        println("The first index value is : ${languages[1]}")
        println("The first index value is : ${languages.get(1)}")

        //Add values to List

        languages.add("C#")
        println(languages)

        languages << "Ruby"
        println(languages)

        languages = languages.plus("Perl")
        println(languages)

        languages = languages + ["R"]
        println(languages)

        //Remove values to List
        languages.remove("C#")
        println(languages)

        languages.remove(3)
        println(languages)

        languages = languages.minus("Perl")
        println(languages)

        languages = languages - ["Java"]
        println(languages)

        //Adding duplicate values
        languages << "Groovy"
        languages << "Groovy"
        languages << "R"

        println(languages)

        //Counting the elements
        println("The count of grrovy is : ${languages.count("Groovy")}")

        //Counting items using closure

        println("""The count of R is : ${languages.count {
            it == "R"
        }}""")

        //Add element using push -> to beginnig of list

        languages.push("C#")
        println(languages)

        //Remove first element using pop
        languages.pop()
        println(languages)

        //Compare to lists
        def languages1 = ["Groovy", "Java","Python"]
        def languages2 = ["Groovy", "Java","Python"]

        if(languages1==languages2){
            println("Both the lists are equal")
        }

        def languages3 = ["Groovy", "Java","Python","C#"]

        if(languages2 == languages3){
            println("Both the lists are equal")
        }else{
            println("Both the lists are NOT equal")
        }

        //Manipulate the list

        def newLanguages = languages.collect {
            it + " Program"
        }

        println(newLanguages)

        //findAll method

        println(languages.findAll {
            it.contains("Groovy")
        })

        //Print all the elements

        languages.each{
            println(it)
        }

}

}