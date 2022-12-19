/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version2;

/**
 *
 * @author Student.Admin
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(double baseSalary, double totalSales, int empID, String empName) {
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }
}

