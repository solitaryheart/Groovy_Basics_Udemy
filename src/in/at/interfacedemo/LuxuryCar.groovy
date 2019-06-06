package in.at.interfacedemo

class LuxuryCar implements Vehicle {

    static main(args){

        LuxuryCar luxCar = new LuxuryCar()

        luxCar.seats()
        luxCar.wheels()
        luxCar.gears()
        luxCar.acOption()

    }


    @Override
    def seats() {
        println("This is 7 seat vehicle")
    }

    @Override
    def wheels() {
        println("This is 6 wheels vehicle")
    }

    @Override
    def gears() {
        println("This is Auto gear vehicle")
    }

    @Override
    def acOption() {
        println("This is Ac option vehicle")
    }
}
