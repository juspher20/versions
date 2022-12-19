/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version2;

/**
 *
 * @author Student.Admin
 */
public class TestingMain {
    public static void main(String [] args) {
        Employee[] e = new Employee [20];
        
        e[0] = new HourlyEmployee(40, 100, 101, "Kiako");
        e[1] = new HourlyEmployee(39, 101, 101, "Miko");
        e[2] = new HourlyEmployee(38, 102, 101, "Angelo");
        e[3] = new HourlyEmployee(37, 103, 101, "Morry");
        e[4] = new HourlyEmployee(36, 104, 101, "Tan");
        
        
        e[5] = new CommissionEmployee(40_000, 102, "Jake");
        e[6] = new CommissionEmployee(39_500, 103, "Juspher");
        e[7] = new CommissionEmployee(37_000, 104, "Chary");
        e[8] = new CommissionEmployee(35_500, 105, "Quincy");
        e[9] = new CommissionEmployee(33_000, 106, "Micheal");
        
        
        
        
        e[10] = new BasePlusCommissionEmployee(25_000.0, 110_000.0, 107, "Anna");
        e[11] = new BasePlusCommissionEmployee(30_000.0, 100_000.0, 108, "Mike");
        e[12] = new BasePlusCommissionEmployee(40_000.0, 90_000.0, 109, "Lord");
        e[13] = new BasePlusCommissionEmployee(10_000.0, 120_000.0, 110, "Jasper");
        e[14] = new BasePlusCommissionEmployee(50_000.0, 130_000.0, 111, "Anonymous");
        
        
        
        
        e[15] = new PieceWorkerEmployee(102,"Charey",120,10);
        e[16] = new PieceWorkerEmployee(103,"Dharey",121,10);
        e[17] = new PieceWorkerEmployee(104,"Eharey",122,10);
        e[18] = new PieceWorkerEmployee(105,"Fharey",123,10);
        e[19] = new PieceWorkerEmployee(106,"Gharey",124,10);
        
        
        
        
        for(Employee emp : e) {
            System.out.println("=======================================================");
            System.out.println(emp);
            System.out.println("=======================================================");
        }
        
        for(Employee emp : e) {
            System.out.println(String.format("%s - Php %,.2f", emp.getEmpName(), emp.computeSalary()));
//            System.out.println("=======================================================");
        }
    }
}

