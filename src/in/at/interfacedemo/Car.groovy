package in.at.interfacedemo

class Car implements Vehicle {

    static main(args){

        Car c = new Car()

        c.seats()
        c.wheels()
        c.gears()
        c.acOption()
    }


    @Override
    def seats() {
        println("This is 5 seats vehicle")
    }

    @Override
    def wheels() {
        println("This is 4 wheels vehicle")
    }

    @Override
    def gears() {
        println("This is manual gear vehicle")
    }

    @Override
    def acOption() {
        println("This is no AC option vehicle")
    }
}
