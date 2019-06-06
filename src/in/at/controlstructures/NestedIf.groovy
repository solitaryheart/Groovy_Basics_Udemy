package in.at.controlstructures

class NestedIf {

    static main(args){
        if (1>0){
            println("Outer if Block")
            if(2>1){
                println("1 is greater than 0 ans 2 is more than 1")
            }

        }

        println("Out of if Block")
    }
}
