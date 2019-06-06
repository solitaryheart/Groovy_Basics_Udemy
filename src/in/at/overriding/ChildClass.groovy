package in.at.overriding

/*
- subclass has same method with SAME NAME, SAME PARAMETERS
of SAME Dataytype -> overriding
- used to provide specific implementation of a method
that is already provided by its parent class

 */

class ChildClass extends ParentClass {

    static main(args){
        ChildClass cc = new ChildClass()
        cc.sum(1,2)
    }

    def sum(a,b){
        println("I am in a Child Sum method.")
        println(a+b)
    }


}
