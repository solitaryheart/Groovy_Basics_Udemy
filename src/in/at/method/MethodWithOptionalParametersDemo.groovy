package in.at.method

class MethodWithOptionalParametersDemo {

    static main(args){

        MethodWithOptionalParametersDemo mwop = new MethodWithOptionalParametersDemo()

        mwop.addThreeNumbers(10,20,30)

        mwop.addThreeNumbers( 20,30)

    }

    //optional paramter definied by using default value, can be over wrritten
    def addThreeNumbers(def firstValue=100, def secondValue, def thirdValue){
        def total = firstValue + secondValue + thirdValue
        println(" The total is " + total)
    }


}
