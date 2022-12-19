/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version4;

/**
 *
 * @author Student.Admin
 */
public class TestingMain {
    public static void main(String [] args) {
        Employee[] e = new Employee [6];
        
        e[0] = new HourlyEmployee(40, 100, 101, "Gorri");
        e[1] = new CommissionEmployee(40_000, 102, "NJ");
        e[2] = new HourlyEmployee(45, 200, 103, "Gran");
        e[3] = new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Juspher");
        e[4] = new CommissionEmployee(5_000, 105, "Chary");
        e[5] = new PieceWorkerEmployee(102,"Kaiko",120,10);
        
        for(Employee emp : e) {
            System.out.println(emp);
        }
        
        for(Employee emp : e) {
            System.out.println(String.format("%s - Php %,.2f", emp.getEmpName(), emp.computeSalary()));
        }
    }
}

//Answer the following in your own words.
//What is the difference between version 1 and 2? Give details of your observations.

//Answer: The difference between version 1 and version 2 is that version 1 parent class which means that you need to instantiate the class name itself in the testing main and it does not have an Employee class while version 2 has its parent class which is the Employee class and the rest of the classes will extend to the Employee class.

//What is the use of the instanceof operator and how does this operator help in making the version 3 and 4?

//Answer: The instance operator  is used to determine whether the given object is a class, subclass or an interface instance. This operator helps in the making of version 3 and 4 as we will not be making classes again instead we will just be instantiating it.

//What is the difference between version 3 and version 4?

//Answer:  The difference between version 3 and version 4 is that version 3 does not contain an abstract class and method and as well as has a new class added to it, the Employee Roster while version 4 has an abstract class and abstract method.

//What is an abstract class and abstract method?

//Answer: An abstract method is one that has no body and can only be used or implemented in an abstract class, whereas an abstract class is one in which objects cannot be created without first inheriting them from other classes.

