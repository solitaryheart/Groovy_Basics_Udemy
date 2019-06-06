package in.at.controlstructures

class ContinueDemo {

    static main(args){

        //printing all values from 1 - 10 except 5
        //if 5 is reached the continue statement is executed
        //controls jumps to loop evaluation again not to next
        //print statement

        for(def i in 1..10){
            if(i == 5)
                continue
            println(i)
        }
    }
}
