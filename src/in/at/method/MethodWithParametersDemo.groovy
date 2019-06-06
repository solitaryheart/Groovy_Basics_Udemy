package in.at.method

class MethodWithParametersDemo {

    static main (args){

        MethodWithParametersDemo mwpd = new MethodWithParametersDemo()

        mwpd.addingThreeNumber(10,20,30)
        mwpd.addingThreeNumber(56,43,67)

    }





    def addingThreeNumber(def firstNumber, def secondNumber, def thirdNumber){

        def total = firstNumber+secondNumber+thirdNumber
        println("The total value is: " +total)
    }

}
