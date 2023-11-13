import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print masukkan panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi : ");
        // input variabel n
        int n = sc.nextInt();
        // outer loop untuk mengulang tiap baris
        for (int i = 1; i <= n; i++) {
            // ngecek baris pertama / terakhir
            if (i == 1 || i == n) {
                // loop buat ngeprint n di baris pertama dan terakhir
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%d ", n);
                }
                // pindah ke baris brikutnya tiap baris
                System.out.println();
            } else {
                // loop buat mencetak n di baris dalam
                for (int k = 1; k <= n; k++) {
                    // ngecek baris pertama / terakhir
                    if (k == 1 || k == n) {
                        System.out.printf("%d ", n);
                    } else if (n < 10) {
                        // jika n < 10 print spasi
                        System.out.print("  ");
                    } else
                    // print spasi untuk angka >= 10
                        System.out.print("   ");
                }
                // pindah ke baris berikutnya 
                System.out.println();
            }
        }
    }
}