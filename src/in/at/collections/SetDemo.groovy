package in.at.collections

/*
- Set should always have unique elements
- Set allows single null value, it will not allow duplicate values
- Set is sortable
- Set does not maintain any order

 */

class SetDemo {

    static main(args){

        //Set Declaration
        def languages =["Groovy","Java","Python"] as Set

        //Print set
        println languages

        //Print set using closure

        languages.each{
            println it
        }

        //Set size

        println("The size of the set is: ${languages.size()}")

        //Retrieve value from set
        println("The second value is: ${languages[2]}")

        //Add values to set

        languages.add("C#")
        println(languages)

        languages << "Ruby"
        println(languages)

        languages = languages.plus("Perl")
        println(languages)

        languages = languages + ["PHP"]
        println(languages)

        //Remove values from Set
        languages.remove("PHP")
        println(languages)

        //Check if Set accept duplicate values -> no !
        languages << "Groovy"
        languages << "Groovy"

        //Compare sets
        def languages1 =["Groovy","Java"] as Set
        def languages2 =["Groovy","Java","C#"] as Set
        def languages3 =["Groovy","Java"] as Set

        if (languages1 == languages3){
            println("Both sets are equal.")
        }

        if (languages1 == languages2){
            println("Both sets are equal.")
        } else{
            println("Both sets are NOT equal.")
        }

        //Manipulate a set

        def newlanguages = languages.collect{
            it + " Program"
        }

        println(newlanguages)

        //findAll method
        def mylanguages = ["English","Polish","German","Italian"]

        println(mylanguages.findAll(){
            it.contains("an")
        })

        //Sort Set

        println(mylanguages.sort())

        //Iterator in Set
        def iterator = mylanguages.iterator()
        while (iterator.hasNext()){
            println(iterator.next())
        }

    }



}
