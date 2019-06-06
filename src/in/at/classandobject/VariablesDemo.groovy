package in.at.classandobject

class VariablesDemo {

    //Class-Level-Variables
    def instanceInt = 15
    def staticInt = 25

    static main (args){
        //Access to local (method) variable is not allowed
        //println("Local variable value is: " +localInt)

        VariablesDemo variablesDemo = new VariablesDemo()
        variablesDemo.method()

        //Multiple variables Assignemts

        def(a,b,c) = [10,20,"groovy"]

        println("a value is: " +a)

        println("b value is: " +b)

        println("c value is: " +c)


    }




    def method(){
        def localInt = 10
        println("Local variable value is: " +localInt)

        //Access to class-level variable is allowed
        println("instance variable value is " + instanceInt)
    }
}
