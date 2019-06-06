package in.at.staticdemo

/*
- > MEMORY MANAGEMENT

a) When an object is created the object itself is stored in the HEAP MEMORY
b) the reference (instance variable to it is stored in the the STACK memory
c) The static variable is stored in the CLASS MEMORY


 */

class StaticDemo {

    static main(args){
        EmployeeData employeeData = new EmployeeData()
        employeeData.empId = 101
        employeeData.empName = "Tom"

        println("Id of employee one is " + employeeData.empId)
        println("Name of Employee one is " + employeeData.empName)
        //Wert der KlassenVariable > companyName
        println("Company of Emloyee one is " + EmployeeData.companyName)


        EmployeeData employeeData1 = new EmployeeData()
        employeeData1.empId = 101
        employeeData1.empName = "Tom"

        println("Id of employee two is " + employeeData1.empId)
        println("Name of Employee two is " + employeeData1.empName)
        //Wert der KlassenVariable > companyName
        println("Company of Emloyee two is " + EmployeeData.companyName)

    }
}
