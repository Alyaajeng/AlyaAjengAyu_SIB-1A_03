import java.util.Scanner;
public class NestedLoop_NIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double [][] temps = new double [5][7];
        double [] kotaRata2 = new double [5];

        // input temperatur data
        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i);
            double kotaSum = 0; 
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = sc.nextDouble(); 
                kotaSum += temps[i][j];
            } 
            kotaRata2[i] = kotaSum / temps[0].length;
            System.out.println(); 
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println("Rata-rata suhu tiap kota : " + kotaRata2[i]);
            System.out.println();
        }
    }
}
