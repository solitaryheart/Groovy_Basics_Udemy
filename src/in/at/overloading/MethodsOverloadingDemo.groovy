package in.at.overloading
/*
 - overloading: class has multiple methods with same name
   but different parameters
 - increases the readability of the program
 - different ways to overload a method:
   a) changing number of arguments
   b) changing the data type

 */

class MethodsOverloadingDemo {

    static main(args){

        MethodsOverloadingDemo moverl = new MethodsOverloadingDemo()

        moverl.add(1,2)
        moverl.add(2,3,4)
        moverl.add(5)
        moverl.add(1,2,3,4)
        moverl.add("Karl","Ist","Ein","Arsch")

    }
    //changing number of arguments
    def add(a, b){
        println(a+b)
    }

    def add(a,b,c){
        println(a+b+c)
    }

    def add(a){
        println(a+a+a)
    }

    //changing data type of arguments

    def add(int a, int b, int c, int d){

        println(a + b + c + d)
    }

    def add(String a, String b, String c, String d){
        println(a+b+c+d)
    }
}
