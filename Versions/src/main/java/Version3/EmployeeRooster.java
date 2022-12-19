/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

/**
 *
 * @author Student.Admins
 */
public class EmployeeRooster {

    int i;
    Employee[] emp = {
        new HourlyEmployee(45, 200, 103, "Gran"),
        new HourlyEmployee(40, 200, 104, "Bejoc"),
        new HourlyEmployee(43, 150, 105, "Alqui"),
        new HourlyEmployee(48, 220, 106, "Sar"),
        new HourlyEmployee(46, 210, 107, "Mal"),
        new CommissionEmployee(40_000, 102, "NJ"),
        new CommissionEmployee(25_000, 110, "MJ"),
        new CommissionEmployee(42_500, 115, "OJ"),
        new CommissionEmployee(37_000, 125, "PJ"),
        new CommissionEmployee(28_000, 137, "QJ"),
        new BasePlusCommissionEmployee(22_000.0, 120_000.0, 104, "Hare"),
        new BasePlusCommissionEmployee(32_000.0, 110_000.0, 123, "Chareb"),
        new BasePlusCommissionEmployee(15_000.0, 90_000.0, 118, "Rebel"),
        new BasePlusCommissionEmployee(25_000.0, 120_000.0, 127, "Bel"),
        new BasePlusCommissionEmployee(30_000.0, 110_000.0, 135, "Char"),
        new PieceWorkerEmployee(132, "Rey", 134, 10),
        new PieceWorkerEmployee(167, "Hans", 128, 10),
        new PieceWorkerEmployee(133, "Sam", 140, 10),
        new PieceWorkerEmployee(164, "Son", 130, 10),
        new PieceWorkerEmployee(158, "Harey", 122, 10),};
        
        

    public Employee[] getEmploy() {
        return emp;
    }

    public void setEmploy(Employee[] emp) {
        this.emp = emp;
    }

    public void CountHourlyEmployee() {
        
        int hcount = 0;
        EmployeeRooster Obj = new EmployeeRooster();
        Employee[] Hlist = Obj.getEmploy();
        for (Employee hr : emp) {
            if (hr instanceof HourlyEmployee) {
                for (i = 0; i < Hlist.length; i++) {
                    hcount++;
                }
            }
        }
        int totnum = hcount / Hlist.length;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total numbers of Hourly Employees: " + totnum);
    }

    public void CountCommissionEmployee() {
        int ccount = 0;
        EmployeeRooster Obj = new EmployeeRooster();
        Employee[] Clist = Obj.getEmploy();
        for (Employee cr : emp) {
            if (cr instanceof CommissionEmployee) {
                for (i = 0; i < Clist.length; i++) {
                    ccount++;
                }
            }
        }
        int totnum = ccount / Clist.length;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total numbers of Commission Employees: " + ccount / Clist.length);
    }

    public void CountBasePlusCommissionEmployee() {
        int bpccount = 0;
        EmployeeRooster Obj = new EmployeeRooster();
        Employee[] BPClist = Obj.getEmploy();
        for (Employee be : emp) {
            if (be instanceof BasePlusCommissionEmployee) {
                for (i = 0; i < BPClist.length; i++) {
                    bpccount++;
                }
            }
        }
        int totnum = bpccount / BPClist.length;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total numbers of Base Plus Commission Employees: " + bpccount / BPClist.length);
    }

    public void PieceWorkerEmployee() {
        int pecount = 0;
        EmployeeRooster Obj = new EmployeeRooster();
        Employee[] PElist = Obj.getEmploy();
        for (Employee pwe : emp) {
            if (pwe instanceof PieceWorkerEmployee) {
                for (i = 0; i < PElist.length; i++) {
                    pecount++;
                }
            }
        }
        int totnum = pecount / PElist.length;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total numbers of Piece Worker Employees: " + pecount / PElist.length);
    }

    public void DisplayHE() {
        Formatter fmat = new Formatter();
        fmat.format("%10s %15s %24s %40s \n", "Name", "Id", "Employee Type", " Salary\n-----------------------------------------------------------------------\n");
        for (Employee hr : emp) {
            if (hr instanceof HourlyEmployee) {
                fmat.format("%10s %15s %24s %15s\n", hr.getEmpName(), hr.getEmpID(), "Hourly Employee", hr.computeSalary());
            }
        }
        System.out.println(fmat);
    }

    public void DisplayCE() {
        Formatter fmat = new Formatter();
        fmat.format("%10s %15s %24s %40s \n", "Name", "Id", "Employee Type", " Salary\n-----------------------------------------------------------------------\n");
        for (Employee ce : emp) {
            if (ce instanceof CommissionEmployee) {
                fmat.format("%10s %15s %24s %15s\n", ce.getEmpName(), ce.getEmpID(), "Commission Employee", ce.computeSalary());
            }
        }
        System.out.println(fmat);
    }

    public void DisplayBPCE() {
        Formatter fmat = new Formatter();
        fmat.format("%10s %15s %24s %40s \n", "Name", "Id", "Employee Type", " Salary\n-----------------------------------------------------------------------\n");
        for (Employee bpce : emp) {
            if (bpce instanceof HourlyEmployee) {
                fmat.format("%10s %15s %24s %15s\n", bpce.getEmpName(), bpce.getEmpID(), "BasePlusCommission Employee", bpce.computeSalary());
            }
        }
        System.out.println(fmat);
    }

    public void DisplayPWE() {
        Formatter fmat = new Formatter();
        fmat.format("%10s %15s %24s %40s \n", "Name", "Id", "Employee Type", " Salary\n-----------------------------------------------------------------------\n");
        for (Employee pwe : emp) {
            if (pwe instanceof HourlyEmployee) {
                fmat.format("%10s %15s %24s %15s\n", pwe.getEmpName(), pwe.getEmpID(), "Piece Worker Employee", pwe.computeSalary());
            }
        }
        System.out.println(fmat);
    }

    public void DisplayAllEmployee() {
        Formatter fmt = new Formatter();
        fmt.format("%10s %15s %24s %20s \n", "Name", "Id", "Employee Type", "Salary\n-----------------------------------------------------------------------\n");
        for (Employee at : emp) {
            fmt.format("%10s %15s %24s %20s \n", at.getEmpName(), at.getEmpID(), at.computeSalary(), at.getClass().getSimpleName());
        }
        System.out.print(fmt);
    }

    public void removeEmployee() {
        Employee addE = new Employee();
        int id = addE.getEmpID();
        Employee[] old = this.getEmploy();
        Employee[] nyew = new Employee[old.length - id];
        int cha = 3;
        for (int i = 0, j = 0; i < old.length; i++) {
            if (i != cha) {
                nyew[j] = old[i];
                j++;
            }

        }

        System.out.format(Arrays.toString(nyew));

    }

    public void addEmployee() {
        Employee[] e =  this.getEmploy();
        for(i = 0;i<e.length;i++)
        {
            i++;

        }
        System.out.println("New Employee Added!");
        System.out.println(new HourlyEmployee(46, 200, 109, "Han"));
    }
    
}
