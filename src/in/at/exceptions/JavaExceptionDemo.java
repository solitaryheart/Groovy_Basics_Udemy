package in.at.exceptions;


/*



Handling 1 - in method signature

public static void main(String[] args) throws FileNotFoundException
-> code can be compiled bacause we are telling java with "throws
-> that there maybe a FileNotFound Exception can be occur, if
-> the file does not exists ! Effekt ->

Handling 2 -> using try catch block


 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaExceptionDemo {

    public static void main(String[] args)  {

        //Checked Exception

        /*
        try {
            FileInputStream fis = new FileInputStream("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\data1.properties");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            //proviing a custommized error message
            System.out.println("File not exists you asshole");
        }*/

        //Unnchecked Runtime Exception
        try {
            int i = 2 / 0;
            System.out.println("The value of i is :" + i);

        }
        catch (ArithmeticException e){
            System.out.println("Division with o not allowed");
        }




    }

}
