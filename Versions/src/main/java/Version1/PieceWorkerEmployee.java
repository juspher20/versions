/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version1;

/**
 *
 * @author Student.Admin
 */
public class PieceWorkerEmployee {
       private int empID;
    private String empName;
    private int totalPiecesFinished;
    private int ratePerPiece;
    
    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    
    

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, int ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(int ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
     public double computeSalary() {
     
        int totalPiece = this.totalPiecesFinished;
        int pieceFinished = 0;
        int plusPiece = 0; 
        int newp = 0;
        int n = 0;
        

        if (totalPiece <= 99 && totalPiece >= 0) {
            pieceFinished = totalPiece * ratePerPiece;

        } else if (totalPiece/100 != n) { 
            n = totalPiece/100;
            plusPiece = (ratePerPiece * 10)*n;
            newp = totalPiece * ratePerPiece;

            pieceFinished = (newp + plusPiece);

        
        }else{
            return 0;
        }
        
        return pieceFinished;
        
    }
     
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        sb.append("\nTotal Pieces Finished: ");
        sb.append(this.getTotalPiecesFinished());
        sb.append(" hour(s)");
        sb.append("\nRate Per Piece: ");
        sb.append(String.format("Php %,.2f", this.getRatePerPiece()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        
        return sb.toString();
    }

}
