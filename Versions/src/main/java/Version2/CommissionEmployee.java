/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version2;

/**
 *
 * @author Student.Admin
 */
public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
    }
    
    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary() {
        float rate;
        
        if(totalSales < 10_000 && totalSales >= 0) {
            rate = 0.05f;
        } else if(totalSales >= 10_000 && totalSales < 50_000) {
            rate = 0.1f;
        } else if(totalSales >= 50_000 && totalSales < 100_000) {
            rate = 0.15f;
        } else if(totalSales >= 100_000) {
            rate = 0.3f;
        } else {
            rate = 0;
        }
        
        return rate * totalSales;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("\nTotal Sales: ");
        sb.append(String.format("Php %,.2f", this.getTotalSales()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        
        return sb.toString();
    }
}
