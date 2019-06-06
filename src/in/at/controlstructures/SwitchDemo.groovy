package in.at.controlstructures

class SwitchDemo {

    //difference to JAVA
    //case 0..34 or {marks < 35} not possible

    static main (args){



    def marks = 61

    switch(marks){

        case {marks < 35}:
            println("Failed.")
            break
        case {marks > 35 && marks < 60}:
            println("Passed in Third Class")
            break
        case {marks > 60 && marks < 75}:
            println("Passed in Second Class.")
            break
        default:
            println("Passsed in First Class")
            break

         }
    }
}