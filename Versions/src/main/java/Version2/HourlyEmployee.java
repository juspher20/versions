/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version2;

/**
 *
 * @author Student.Admin
 */
public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour, int empID, String empName) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        float time = this.totalHoursWorked;
        float ot = 0;

        if (time > 40) {
            ot = time - 40;
            time = 40;
        }

        return time * ratePerHour + ot * ratePerHour * 1.5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nTotal Hours Worked: ");
        sb.append(this.getTotalHoursWorked());
        sb.append(" hour(s)");
        sb.append("\nRate per hour: ");
        sb.append(String.format("Php %,.2f", this.getRatePerHour()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));

        return sb.toString();
    }

}
