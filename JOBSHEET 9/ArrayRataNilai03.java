import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa : " );
        int jmlMhs = scan.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        int mhsLulus = 0;
        int mhsTdkLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                mhsTdkLulus++;
            }
        }
        System.out.println("Rata - rata nilai lulus = " +totalLulus/mhsLulus);
        System.out.println("Rata - rata nilai tidak lulus = " +totalTdkLulus/mhsTdkLulus);
    }
}
