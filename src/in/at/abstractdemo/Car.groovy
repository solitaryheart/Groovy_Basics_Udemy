package in.at.abstractdemo

class Car extends Vehicle {

    static main (args){

        Car c = new Car()

        //inherited from super class Vehicle
        c.seats()
        c.wheels()

        //implemented here
        c.powerWindows()
        c.acOption()
        c.gears()
    }





    //methods only contained in subclass

    def powerWindows(){
        println("No power windows")
    }


    //from super class, can implemented here
    @Override
    def gears() {
        println("This is a Menual gear vehicle")

    }

    @Override
    def acOption() {
        println("No AC Option")

    }
}
