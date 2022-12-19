/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student.Admin
 */
public class TestingMain {
       public static void main(String[] args)
    { 
        
        Scanner sc = new Scanner(System.in);  
        EmployeeRoster employees = new EmployeeRoster();
         int ch;
           
    
    do{
          
           
        System.out.println("\n ***Employee's Details***");  
        System.out.println("1. Display all Hourly Employee and Total Number \n 2. Display all Commission Employees and Total Number \n 3. Display all BasePlusCommission Employees and Total Number \n 4.Display Piece Worker Employees and Total Number \n 5.Display All Employees \n 6.Exit ");  
        System.out.println("Enter your choice: ");  
        ch = sc.nextInt();
      if (ch==1){
            System.out.println("\n" + "Hourly Employees:");
            System.out.println(employees.DisplayHourlyEmployee());
            System.out.println("Total count of HourlyEmployees:" + employees.getCountHourlyEmployee());
        
        }
        else if (ch==2){
            System.out.println("\n" + "Commission Employees:");
            System.out.println(employees.DisplayCommissionEmployee());
            System.out.println("Total count of CommissionEmployees:" + employees.getCountCommissionEmployee());
            
        }
        else if (ch==3){
                
             System.out.println("\n" + "BasePlusCommission Employees:");
             System.out.println(employees.DisplayBasePlusCommissionEmployee());
             System.out.println("Total count of BasePlusCommissionEmployees:" + employees.getCountBasePlusCommissionEmployee());
        }
        else if (ch==4){
            System.out.println("\n" + "Piece Worker Employees:");
            System.out.println(employees.DisplayPieceWorkerEmployee());
            System.out.println("Total count of PieceWorkerEmployees:" + employees.getCountPieceWorkerEmployee());
            
            
        }
        else if(ch==5){
            int totalCount = employees.getCountHourlyEmployee();    
            int totalCount1 = employees.getCountCommissionEmployee();
            int totalCount2 = employees.getCountBasePlusCommissionEmployee();
            int totalCount3 = employees.getCountPieceWorkerEmployee();
            System.out.println("Total count of HourlyEmployees:" + totalCount);
            System.out.println("Total count of CommissionEmployees:" + totalCount1);
            System.out.println("Total count of BasePlusCommissionEmployees:" + totalCount2);
            System.out.println("Total count of PieceWorkerEmployees:" + totalCount3);

            System.out.println("==================================================================");
            System.out.println("\n" + "Hourly Employees:");
            System.out.println(employees.DisplayHourlyEmployee());
            System.out.println("==================================================================");
            System.out.println("\n" + "Commission Employees:");
            System.out.println(employees.DisplayCommissionEmployee());
            System.out.println("==================================================================");
            System.out.println("\n" + "BasePlusCommission Employees:");
            System.out.println(employees.DisplayBasePlusCommissionEmployee());
            System.out.println("==================================================================");
            System.out.println("\n" + "Piece Worker Employees:");
            System.out.println(employees.DisplayPieceWorkerEmployee());
            System.out.println(employees);
        }
        
    }
      while(ch!=6);
           
      
        
//         Employee[] e = new Employee [6];
//        
//        e[0] = new HourlyEmployee(40, 100, 101, "Gorri");
//        e[1] = new CommissionEmployee(40_000, 102, "NJ");
//        e[2] = new HourlyEmployee(45, 200, 103, "Gran");
//        e[3] = new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Charebel");
//        e[4] = new CommissionEmployee(5_000, 105, "Jovanie");
//        e[5] = new PieceWorkerEmployee(102,"Charey",120,10);
//        
//        
//        for(Employee emp : e) {
//            System.out.println(emp);
//        }
//        
//        for(Employee emp : e) {
//            System.out.println(String.format("%s - Php %,.2f", emp.getEmpName(), emp.computeSalary()));
//        }
        
//        Collection<Employee> queue = new ConcurrentLinkedQueue<Employee>();  
//        Employee employee1=new HourlyEmployee(40,100,101,"cha") ;  
//        Employee employee2=new CommissionEmployee(40_000, 102, "NJ");
//        Employee employee3=new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Charebel"); 
//        Employee employee4= new PieceWorkerEmployee(102,"Charey",225,10);  
//        queue.add(employee1);  
//        queue.add(employee2);  
//        queue.add(employee3);  
//        queue.add(employee4); 
        
        
        
//        int totalCount = employees.getCountHourlyEmployee();    
//        int totalCount1 = employees.getCountCommissionEmployee();
//        int totalCount2 = employees.getCountBasePlusCommissionEmployee();
//        int totalCount3 = employees.getCountPieceWorkerEmployee();
//        System.out.println("Total count of HourlyEmployees:" + totalCount);
//        System.out.println("Total count of CommissionEmployees:" + totalCount1);
//        System.out.println("Total count of BasePlusCommissionEmployees:" + totalCount2);
//        System.out.println("Total count of PieceWorkerEmployees:" + totalCount3);
//        
//        System.out.println("==================================================================");
//        System.out.println("\n" + "Hourly Employees:");
//        System.out.println(employees.DisplayHourlyEmployee());
//        System.out.println("==================================================================");
//        System.out.println("\n" + "Commission Employees:");
//        System.out.println(employees.DisplayCommissionEmployee());
//        System.out.println("==================================================================");
//        System.out.println("\n" + "BasePlusCommission Employees:");
//        System.out.println(employees.DisplayBasePlusCommissionEmployee());
//        System.out.println("==================================================================");
//        System.out.println("\n" + "Piece Worker Employees:");
//        System.out.println(employees.DisplayPieceWorkerEmployee());
//        System.out.println(employees);
        }
}