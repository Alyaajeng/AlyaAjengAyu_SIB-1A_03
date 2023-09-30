import java.util.Scanner;

public class PemilihanPercobaan2_03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        float uas, uts, kuis, tugas, total;
        System.out.println("Nilai uas    :");
        uas = input03.nextFloat();
        System.out.println("Nilai uts    :");
        uts = input03.nextFloat();
        System.out.println("Nilai kuis   :");
        kuis = input03.nextFloat();
        System.out.println("Nilai tugas  :");
        tugas = input03.nextFloat();
        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        // String message = total < 65 ? "Remidi" : "Tidak remidi";
        // System.out.println("Nilai akhir = " + total + " sehingga " + message);
        if (total > 80 && total <= 100) {
            System.out.println("Nilai huruf A");
            System.out.println("Nilai setara 4");
            System.out.println("Kualifikasi Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai huruf B+");
            System.out.println("Nilai setara 3.5");
            System.out.println("Kualifikasi Lebih dari Baik");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai huruf B");
            System.out.println("Nilai setara 3");
            System.out.println("Kualifikasi Baik");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai huruf C+");
            System.out.println("Nilai setara 2.5");
            System.out.println("Kualifikasi Lebih dari Cukup");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai huruf C");
            System.out.println("Nilai setara 2");
            System.out.println("Kualifikasi Cukup");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai huruf D");
            System.out.println("Nilai setara 1");
            System.out.println("Kualifikasi Kurang");
        } else if (total <= 39) {
            System.out.println("Nilai huruf E");
            System.out.println("Nilai setara 0");
            System.out.println("Kualifikasi Gagal");
        } else {
            System.out.println("Terjadi kesalahan");
        }

    }
}
