/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Version1;

/**
 *
 * @author Student.Admin
 */
public class TestingMain {
     public static void main(String[] args){
            HourlyEmployee[] he_list = new HourlyEmployee[5];
            he_list[0] = new HourlyEmployee(105,"cha",42,100);
            he_list[1] = new HourlyEmployee(101, "Mark",41,100);
            he_list[2] = new HourlyEmployee(102, "Angie", 40, 100);
            he_list[3] = new HourlyEmployee(103, "NJ", 35, 100);
            he_list[4] = new HourlyEmployee(104, "Godwin", 45, 100);
           
            CommissionEmployee[] ce = new CommissionEmployee[5];
            ce[0] = new CommissionEmployee(40_000,"Kristine",127);
            ce[1] = new CommissionEmployee(15_000,"Cristel",112);
            ce[2] = new CommissionEmployee(20_000,"Mae",122);
            ce[3] = new CommissionEmployee(30_000,"Ritch",132);
            ce[4] = new CommissionEmployee(35_000,"Mon",142);

            BasePlusCommissionEmployee[] bpce = new BasePlusCommissionEmployee[5];
            bpce[0] = new BasePlusCommissionEmployee( 113, "Charebel",20_000, 100_000);
            bpce[1] = new BasePlusCommissionEmployee( 123, "Beh",10_000, 150_000);
            bpce[2] = new BasePlusCommissionEmployee( 133, "Jean",25_000, 90_000);
            bpce[3] = new BasePlusCommissionEmployee( 143, "Maribel",35_050, 110_000);
            bpce[4] = new BasePlusCommissionEmployee( 153, "Charles",20_000, 120_000);


            PieceWorkerEmployee[] pe = new PieceWorkerEmployee[5];
            pe[0] = new PieceWorkerEmployee(174, "Godwin", 300, 10);
            pe[1] = new PieceWorkerEmployee(114, "Reniel", 500, 10);
            pe[2] = new PieceWorkerEmployee(124, "Kharese", 450, 10);
            pe[3] = new PieceWorkerEmployee(134, "Nicole", 240, 10);
            pe[4] = new PieceWorkerEmployee(144, "Sheila", 350, 10);

            System.out.println("=======================================================");
            System.out.println("Hourly Employees");
            System.out.println("=======================================================");
            for(HourlyEmployee e : he_list) {
                System.out.println(e);
                
            }
            System.out.println("=======================================================");
            System.out.println("Commission Employees");
            System.out.println("=======================================================");
            for(CommissionEmployee c : ce) {
                System.out.println(c);
                
            }
            System.out.println("=======================================================");
            System.out.println("Base Plus Commission Employees");
            System.out.println("=======================================================");
            for(BasePlusCommissionEmployee bpe : bpce) {
                System.out.println(bpe);
                
            }
            System.out.println("=======================================================");
            System.out.println("Piece Worker Employees");
            System.out.println("=======================================================");
            for(PieceWorkerEmployee p : pe) {
                System.out.println(p);
            }


    }
}
