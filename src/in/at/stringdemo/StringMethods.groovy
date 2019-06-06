package in.at.stringdemo

class StringMethods {

    static main(args){

        //Strings are Immutable (unveränderbar
        //always a new String object will be created

        def s ="Groovy"
        def s1= s.concat(" Program")

        print(s1)

        def str1 = "Groovy"
        def str2 = "groovy"
        def str3 = ""
        def str4 = "Java Programm"
        def str5 = "Larissa Feierabend"
        def str6 = "     Matthias Meier   "


        //Length of string -> total character count
        println("The length of the string is "+str1.length())

        //Display character at index position
        println("The character at position at position 4 is " +str2.charAt(4))

        //Contains char sequennce
        println("The Contains vaalue is: "+ s1.contains("oo"))

        //Starts with char sequence
        println("The starts with demo : "+s1.startsWith("Gr"))

        //Ends with char sequence
        println("The ends with demo : "+s1.endsWith("gram"))

        //Are 2 string equal ? -> case sensitive
        println("The Equals demo: "+ str1.equals(str2))

        //Index position of a character
        println("The index of y is: " +str1.indexOf('y'))

        //Is string empty ?
        println("The Empty demo : " +str1.isEmpty())
        println("The Empty demo : " +str3.isEmpty())

        //Replace demo
        println("The Replace demo: " +str4.replace("Java","Visual"))

        //Substring out of char sequence with start and end index position
        println("The substring demo: " + str5.substring(8,18))

        //To Lower Case
        println("The lower case demo: " + str5.toLowerCase())

        //To Upper Case
        println("The upper case demo " + str5.toUpperCase())

        //Trim -> removing empty space
        println("The trim demo " + str6.trim())

        def str7 = "Matthias Meier lebt in Dortmund"

        //Split demo -> extracting each substring by using
        //regex seperator character an putting into array
        //and display specific array-item

        println("The split demo " + str7.split(" ")[0])
        println("The split demo " + str7.split(" ")[1])
        println("The split demo " + str7.split(" ")[2])
        println("The split demo " + str7.split(" ")[3])
        println("The split demo " + str7.split(" ")[4])

        def str8 = "Matthias"
        def str9 = "MATTHIAS"

        //Compare stings - ignore case sensivity

        println("The ignore case demo " +str8.equalsIgnoreCase(str9))

    }
}
