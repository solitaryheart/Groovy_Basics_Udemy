package in.at.controlstructures

class BreakDemo {

    //prints 1-4- when 5 is reach the break statement
    //is executed an the complete is completely terminated

    static main(args){
        for(def i in 1..10){
            if(i==5)
                break
            println(i)
        }
    }
}
