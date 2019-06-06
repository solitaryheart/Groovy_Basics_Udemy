package in.at.classandobject

class Laptop {

    def price
    //def brand
    def isScreenWorkingCondition

    static main(args)
    {
        // Creating object
        Laptop lenovo = new Laptop()
        lenovo.logIn()
        lenovo.logOut()

        lenovo.price = 10000
        lenovo.isScreenWorkingCondition = true

        println(lenovo.price)
        println(lenovo.isScreenWorkingCondition)

        Laptop apple = new Laptop()
        apple.price = 50000
        apple.isScreenWorkingCondition = true

        println(apple.price)
        println(apple.isScreenWorkingCondition)


    }

    def logIn(){
        println ("System Loggin In.")

    }

    def logOut(){
        println("System loggin out")
    }


}
