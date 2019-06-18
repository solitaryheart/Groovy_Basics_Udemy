package in.at.oops.inheritancedemo.multinheritance

//Multi-Level-Inheritanca
// Class A implements method 1,2
// Class B extends Class A and implements methods 3,4 -> can access 1,2,3,4
// Class C extends Class B and implements methods 5,6 -> can access 1,2,3,4,5,6

class ScientificCalculator extends AdvancedCalculator {

    static main(args){

        ScientificCalculator sc = new ScientificCalculator()

        //Inherited Methods from Calculator Class
        sc.add()
        sc.substract()

        //Inherited Methods from Advanced Calculator Class
        sc.multiply()
        sc.divide()

        //self implemented Methods
        sc.calculus()
        sc.statistics()
    }


    def calculus()
    {
        println("Calculus functions")
    }

    def statistics()
    {
        println("Statistics functions")
    }


}
