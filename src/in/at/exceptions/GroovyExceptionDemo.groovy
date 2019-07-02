package in.at.exceptions

/* Groovy exception handling differences
- no need to provide "throws" in method signature cause
groovy handles compile-error internally

- groovy does not know checked exceptions

- different catch in unchecked exception
instead of Java: catch (ArithmeticException e)
in Groovy: catch (ArithmeticException)
 */

class GroovyExceptionDemo {

    static main(atgs){
        /*
        try{
            FileInputStream fis = new FileInputStream("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\data1.properties")
        } catch(FileNotFoundException e){
            println("File does not exists you butthead")
        }

         */


        //Unchecked exception

        try {
            def i = 2 / 0
            println("The value of i is : $i")
        }catch (ArithmeticException){
            println("Can not divide by zero.")
        }



    }
}
