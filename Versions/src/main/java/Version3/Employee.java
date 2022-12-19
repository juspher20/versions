/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author Student.Admin
 */
public class Employee {
    private int empID;
    private String empName;
   
    
  
    

    public Employee(){
//         Collection<Employee> queue = new ConcurrentLinkedQueue<Employee>();  
//            Employee employee1=new HourlyEmployee(40,100,101,"cha") ;  
//            Employee employee2=new CommissionEmployee(40_000, 102, "NJ");
//            Employee employee3=new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Charebel"); 
//            Employee employee4= new PieceWorkerEmployee(102,"Charey",225,10);  
//            queue.add(employee1);  
//            queue.add(employee2);  
//            queue.add(employee3);  
//            queue.add(employee4); 
        
        
//        employees.remove(0);
    }
    

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public void displayInfo() {
        System.out.println(this);
    }
    
    
    
    public  double computeSalary(){
        return this.computeSalary();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        
        return sb.toString();
    }
        
    
}
