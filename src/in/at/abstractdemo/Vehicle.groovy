package in.at.abstractdemo

//abstract class must be declared as abstract
// can contain non-abstract and abstract methods

//can not be instanziated !

abstract class Vehicle {

    //non-abstract methods
    def seats(){
        println("5 seat vehicle")
    }

    def wheels(){
        println("4 wheels vehicle")
    }

    //abstract methods -> CAN optional be implemented in inheriting subclasses

    abstract def gears()

    abstract def acOption()
}
