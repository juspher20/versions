/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version1;

/**
 *
 * @author Student.Admin
 */
public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private float totalSales;
    private float baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public BasePlusCommissionEmployee(int empID, String empName, float totalSales, float baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
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
        
        return rate * totalSales + baseSalary;
    }
    
    public void displayInfo() {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        sb.append("\nTotal Sales: ");
        sb.append(String.format("Php %,.2f", this.getTotalSales()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        
        return sb.toString();
    }

}
