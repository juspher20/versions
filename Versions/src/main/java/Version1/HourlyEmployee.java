/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version1;

/**
 *
 * @author Student.Admin
 */
public class HourlyEmployee {
        private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;
    
    
  //same name but different parameters-overloaded constructors
    public HourlyEmployee(){
         

    }
    
  
    
    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour){
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
     public int getEmpID(){
        return empID;
    }
      public void setEmpName(String empName){
        this.empName = empName;
    }
     public String getEmpName(){
        return empName;
    }
     public void setTotalHoursWorked(float totalHoursWorked){
        this.totalHoursWorked = totalHoursWorked;
    }
     public float getTotalHoursWorked(){
        return totalHoursWorked;
    }
     public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }
     public double getRatePerHour(){
        return ratePerHour;
    }
     
     
     public void displayinfo(){
         System.out.println(this);
     }
     public double ComputeSalary(){
       float totalHours = this.totalHoursWorked;
       float overtimeHours = totalHoursWorked - 8;
       
       if (totalHours > 40){
           overtimeHours = totalHours - 40;
           totalHours = 40;
       }
       return totalHours * ratePerHour + overtimeHours * ratePerHour * 1.5;
    }
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        sb.append("\nTotal Hours Worked: ");
        sb.append(this.getTotalHoursWorked());
        sb.append(" hour(s)");
        sb.append("\nRate per hour: ");
        sb.append(String.format("Php %,.2f", this.getRatePerHour()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.ComputeSalary()));
        
        return sb.toString();
    }

}
