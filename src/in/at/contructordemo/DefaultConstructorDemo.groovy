package in.at.contructordemo

class DefaultConstructorDemo {

    //Constructor-Method has same name as Class
    DefaultConstructorDemo()
    {
        println "This is Default Construcor"
    }

    static main(args){
        //no need to invoke Construcor method
        //create a objectvariable is enough

        DefaultConstructorDemo defaultConstructorDemo = new DefaultConstructorDemo()
    }
}
