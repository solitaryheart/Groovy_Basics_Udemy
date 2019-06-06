package in.at.contructordemo

class ParameterizedConstructorDemo {

    def empName
    def empId

    ParameterizedConstructorDemo(empName, empId) {
        this.empName = empName
        this.empId = empId

        println "The Employee Name is: " + empName
        println "The Employye Id is : " + empId

    }

    static main(args) {

        ParameterizedConstructorDemo emp1 = new ParameterizedConstructorDemo("Paul", 45)
        ParameterizedConstructorDemo emp2 = new ParameterizedConstructorDemo("Larissa", 56)


    }



}
