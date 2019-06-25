package in.at.json

import groovy.json.JsonSlurper

/*
- JSON is a lightweight data-interchange format
- JSON is a text format that is completely language independent
- JSON is a collection of name/value pairs
- JSONSlurper is a class in groovy to parse JSON files
- Parsing: breaking data into smaller elements for eas translatin into
another language
- JSON parser is designed to reas the JSON an create a way for
  programs to use JSON
- JSON parser validates the document and check that the document is
well formatted
- JSON parser - important to read, update, create and manipulate a JSON file




 */

class JsonSlurperSimpleDemo {

    static main (args){

        //creating a reference to JSONSlurper
        def jsonSlurper = new JsonSlurper()

        //create a sample JSON object

        def datatypes = jsonSlurper.parseText('''
          {
              "numeric": {
                "int": "10"
              },
                "float": "0.0f",
                "double": "0.0d",
                "boolean":true
          }''')

        //parsing the values

        println("The integer value is: ${datatypes.numeric.int}")
        println("The float value is: ${datatypes.float}")
        println("The boolean value is: ${datatypes.boolean}")










    }
}
