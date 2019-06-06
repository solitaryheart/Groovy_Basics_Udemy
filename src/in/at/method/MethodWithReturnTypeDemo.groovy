package in.at.method

class MethodWithReturnTypeDemo {

    static main(args){
        def m = 10

        MethodWithReturnTypeDemo mwrt = new MethodWithReturnTypeDemo()
            def total = mwrt.sumOfThreeNumber(10,20,30)
            def finalValue = total *m
        println("The multiplied value is: " + finalValue)


    }

    def sumOfThreeNumber(a, b, c){
        a+b+c

    /*Schreibweise in JAVA wäre

    public int sumofThreeNumber(int a, int b, int c){
        int total = a+b+c
        return total
    }

    -> Java muss den Datentyp des return Values angeben
    -> bei Groocvy is return am MethodenEnde absolet,


     */

    }
}
