package in.at.controlstructures

class ForDemo {

    static main(args){
        println("_____________ JAVA FOR LOOP_________________________")

        // For Loop in Java -> Increment 1

        for(def i=0; i <=10; i++){
            println("The value of i is: " +i)

        }

        println("_____________ JAVA FOR LOOP -> INCREMENT 2___________")

        //For Loop in Java -> Increment 2

        for(def i=0; i<=10; i=i+2){
            println("The value of i is: " + i)
        }

        println("___ JAVA FOR EACH LOOP -> UDED IN LISTS___________")

        def languages =["Groovy", "Java", "Python"]

        //For Each in Java
        for(def language : languages){
            println(language)
        }


        println("___ GROOVY FOR  LOOP -> USING UP_TO___________")

        //Printing 0 untiil 10 -> 11 times
        0.upto(10){
            println(it)
        }

        println("___ GROOVY FOR  LOOP -> USING TIMES___________")

        //Printing 10 times

        10.times {
            println(it)
        }

        println("___ GROOVY FOR  LOOP -> USING FOR___________")

        for(j in 1..13){
            println(j)
        }

        println("___ GROOVY FOR  EACH_________________________")

        def mylanguages = ["English", "French", "German"]

        mylanguages.each{
            println(it)
        }

        println("___ GROOVY FOR  EACH 2________________________")

        (4..11).each{
            println(it)
        }

        println("___ GROOVY FOR  STEP________________________")

        // Step -> 2 -> difference Java - only 0-8 !
        0.step(10,2){
            println(it)
        }
    }

}
