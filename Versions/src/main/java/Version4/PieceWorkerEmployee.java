/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version4;

/**
 *
 * @author Student.Admin
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private int ratePerPiece;

    public PieceWorkerEmployee() {
    }

    
    
    
    public PieceWorkerEmployee(int totalPiecesFinished, int ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    public PieceWorkerEmployee(int empID, String empName,int totalPiecesFinished, int ratePerPiece) {
        super(empID,empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    @Override
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
        sb.append(String.format(" %,.2f", this.getRatePerPiece()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        
        return sb.toString();
    }
    
}

