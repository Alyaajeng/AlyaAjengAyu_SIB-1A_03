import java.util.Scanner;

public class Gaji03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //Deklarasi
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji=40000, potGaji=25000;

        //Input
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();

        //Output
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang Anda terima adalah " +TotGaji);

    }
}
