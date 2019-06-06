package in.at.staticdemo

class StaticMethodDemo {

    def num = 10

    //static Variable
    static staticNum = 20

    static main(args){
        StaticMethodDemo staticMethodDemo = new StaticMethodDemo()

        //invoke Method by using reference variable
        staticMethodDemo.sum()

        //invoke static static method without creating class

        staticSum()



    }

    def sum(){
        println(num+num)
    }

    //defining staticMethod

    def static staticSum(){
        println staticNum + staticNum
    }






}
