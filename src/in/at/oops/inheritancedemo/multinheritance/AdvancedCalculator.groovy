package in.at.oops.inheritancedemo.multinheritance

class AdvancedCalculator extends Calculator {

    //inherits instance variables and methods from calculator
    // -> here methods: add() and substract

    static main(args){

        AdvancedCalculator ac = new AdvancedCalculator()
        ac.add()
        ac.substract()
        ac.multiply()
        ac.divide()
    }







    def multiply(){
        println("Multiplying numbers")
    }

    def divide(){
        println("Dividing the numbers")
    }

}
