package in.at.classandobject

class ArrayDemo {

    static main (args){

        //declaring the array -> fixed sized
        def languages = new String[3]
        def myintegers = new Integer[5]

        //Assigning values to array-variables -> method 1

        languages[0] = "Groovy"
        languages[1] = "Java"
        languages[2] = "Python"

        //Assigning values to array variables -> method 2

        myintegers.putAt(0,41)
        myintegers.putAt(1,42)
        myintegers.putAt(2,43)
        myintegers.putAt(3,44)
        myintegers.putAt(4,45)

        //Array printing

        println languages
        println myintegers

        //Printing size of the array -> size() + length()

        println("Size of array using size is " +languages.size())
        println("Size of array using lenngth is " +myintegers.length)

        //Remove values from array

        def arrayAfterRemovePython = languages - "Python"
        def arrayAfterRemove45 = myintegers -45

        println(arrayAfterRemovePython)
        println(arrayAfterRemove45)






    }
}
