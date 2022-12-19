/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version3;

import java.util.ArrayList;
import java.util.Collection;
     

/**
 *
 * @author Student.Admin
 */
public class EmployeeRoster {
    
   private ArrayList<HourlyEmployee>employees;
   private ArrayList<CommissionEmployee>employees1;
   private ArrayList<BasePlusCommissionEmployee>employees2;
   private ArrayList<PieceWorkerEmployee>employees3;
//    
    
    public EmployeeRoster(){
       employees = new ArrayList<HourlyEmployee>();
       employees1 = new ArrayList<CommissionEmployee>();
       employees2 = new ArrayList<BasePlusCommissionEmployee>();
       employees3= new ArrayList<PieceWorkerEmployee>();
        
        employees.add(new HourlyEmployee(45, 200, 103, "Gran"));
        employees.add(new HourlyEmployee(40, 200, 103, "Bejoc"));
        employees1.add(new CommissionEmployee(40_000, 102, "NJ"));
        employees2.add( new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Charebel"));
        employees3.add(new PieceWorkerEmployee(102,"Charey",120,10));
        
//        employees1.remove(0);
   }
    public int getCountHourlyEmployee() {
       return this.employees.size();
    }
    public int getCountCommissionEmployee() {
       return this.employees1.size();
    }
    public int getCountBasePlusCommissionEmployee() {
       return this.employees2.size();
    }
    public int getCountPieceWorkerEmployee() {
       return this.employees3.size();
    }
    public String DisplayHourlyEmployee() {
       return this.employees.toString();
    }
    public String DisplayCommissionEmployee(){
       return this.employees1.toString();
    }
    public String DisplayBasePlusCommissionEmployee(){
       return this.employees2.toString();
    }
    public String DisplayPieceWorkerEmployee(){
       return this.employees3.toString();
    }
    
   


    
    
}

//           private ArrayList<Employee>list=new ArrayList<Employee>(6);
//            Employee employee1=new HourlyEmployee(40,100,101,"cha") ;  
//            Employee employee2=new CommissionEmployee(40_000, 102, "NJ");
//            Employee employee3=new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Charebel"); 
//            Employee employee4= new PieceWorkerEmployee(102,"Charey",225,10);  
//		
//            
//		public void add(Employee e) {
//		list.add(e);
//                list.add(employee2);
//                list.add(employee3);
//                list.add(employee4);
//                
//		}
//		public void remove(Employee re) {
//			list.remove(re);
//		}
//		public int count() {
//			return list.size();	// returns number of employees
//		}
//		public int countCE() { // returns number of commission employees
//			int ce=1;
//			for (int i = 1; i<6; i++) {
//				if (list.get(i) instanceof CommissionEmployee) {
//                                    list.add(employee1);
//					ce++;
//				}
//			}return ce;
//		}
//		public int countPE() {// returns number of piece workers
//			int pe=0;
//			for (int i = 0; i<6; i++) {
//				if (list.get(i) instanceof PieceWorkerEmployee) {
//					pe++;
//				}
//			}return pe;
//		} 
//		public int countHE(){// returns number of hourly employees
//			int he=0;
//			for (int i = 0; i<6; i++) {
//				if (list.get(i) instanceof HourlyEmployee) {
//					he++;
//				}
//			}return he;
//		} 
//		public void display(){// displays all employees
//			for (int i = 0; i< 6; i++){
//			System.out.println(list.get(i).getEmpName());
//			}
//		} 
//		public void displayCE(){// displays all commission employees
//			for (int i = 0; i<6; i++) {
//				if (list.get(i) instanceof CommissionEmployee) {
//					System.out.println(list.get(i).getEmpName());
//				}
//			}
//		} 
//		public void displayPE(){
//			for (int i = 0; i<6; i++) {
//				if (list.get(i) instanceof PieceWorkerEmployee) {
//					System.out.println(list.get(i).getEmpName());
//				}
//			}
//		} // displays all piece workers
//		public void displayHE(){
//			for (int i = 0; i<6; i++) {
//				if (list.get(i) instanceof HourlyEmployee) {
//					System.out.println(list.get(i).getEmpName());
//				}
//			}
//		} // displays all hourly employees
//		public void payroll(){// computes and displays all employees and their earnings
//			for (int i = 0; i<6; i++) {
//				System.out.println(list.get(i).getEmpName()+" "+ list.get(i).computeSalary());
//			}
//		} 
//	}


























//  private ArrayList<HourlyEmployee>employees;
//    private ArrayList<CommissionEmployee>employees1;
//  private ArrayList<BasePlusCommissionEmployee>employees2;
//   private ArrayList<PieceWorkerEmployee>employees3;
////    
//    
//    public EmployeeRooster(){
//       employees = new ArrayList<HourlyEmployee>();
//       employees1 = new ArrayList<CommissionEmployee>();
//       employees2 = new ArrayList<BasePlusCommissionEmployee>();
//       employees3= new ArrayList<PieceWorkerEmployee>();
//        
//        employees.add(new HourlyEmployee(45, 200, 103, "Gran"));
//        employees.add(new HourlyEmployee(40, 200, 103, "Bejoc"));
//        employees1.add(new CommissionEmployee(40_000, 102, "NJ"));
//        employees2.add( new BasePlusCommissionEmployee(20_000.0, 100_000.0, 104, "Charebel"));
//        employees3.add(new PieceWorkerEmployee(102,"Charey",120,10));
//        
//        employees1.remove(0);
//   }
//    public int getCountHourlyEmployee() {
//       return this.employees.size();
//    }
//    public int getCountCommissionEmployee() {
//       return this.employees1.size();
//    }
//    public int getCountBasePlusCommissionEmployee() {
//       return this.employees2.size();
//    }
//    public int getCountPieceWorkerEmployee() {
//       return this.employees3.size();
//    }
//    public String DisplayHourlyEmployee() {
//       return this.employees.toString();
//    }
//    public String DisplayCommissionEmployee(){
//       return this.employees1.toString();
//    }
//    public String DisplayBasePlusCommissionEmployee(){
//       return this.employees2.toString();
//    }
//    public String DisplayPieceWorkerEmployee(){
//       return this.employees3.toString();
//    }
//    
   
//    public static void main(String[] args){
//        EmployeeRooster employees = new EmployeeRooster();
//       
//        int totalCount = employees.getCountHourlyEmployee();    
//        int totalCount1 = employees.getCountCommissionEmployee();
//        int totalCount2 = employees.getCountBasePlusCommissionEmployee();
//        int totalCount3 = employees.getCountPieceWorkerEmployee();
//        System.out.println("Total count of HourlyEmployees\t Total Count of Commission");
//        
//        System.out.println("Total count of CommissionEmployees:" + totalCount1);
//        System.out.println("Total count of BasePlusCommissionEmployees:" + totalCount2);
//        System.out.println("Total count of PieceWorkerEmployees:" + totalCount3);
//        System.out.println("\n" + "Hourly Employees:");
//        System.out.println(employees.DisplayHourlyEmployee());
//        System.out.println("\n" + "Commission Employees:");
//        System.out.println(employees.DisplayCommissionEmployee());
//        System.out.println("\n" + "BasePlusCommission Employees:");
//        System.out.println(employees.DisplayBasePlusCommissionEmployee());
//        System.out.println("\n" + "Piece Worker Employees:");
//        System.out.println(employees.DisplayPieceWorkerEmployee());
//        
//    
//       }
 
   
