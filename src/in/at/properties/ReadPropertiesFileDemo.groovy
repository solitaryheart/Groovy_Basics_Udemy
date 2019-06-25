package in.at.properties

class ReadPropertiesFileDemo {

    /* reading value from data.properties file located
      in package "files"
     */

    static main (args){

        def reader = new FileReader("C:\\udemy\\Groovy\\My_Project_Workspace\\src\\in\\at\\files\\data.properties")
        def properties = new Properties()

        //loading data from reader to properties

        properties.load(reader)

        println("The value of email is: " +properties.getProperty("email"))
        println("The value of password is: " +properties.getProperty("password"))
        println("The value of phone is: " +properties.getProperty("phone"))

    }
}
