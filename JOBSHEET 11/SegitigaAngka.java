import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        // print memasukkan nilai untuk n
        System.out.print("Masukkan nilai N = ");
        // input variabel n
        int n = sc.nextInt();
        // outer loop for untuk mengulang tiap baris
        for(int i = 1; i <= n; i++){
            // inner loop 1 untuk print sebelum angka
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            // inner loop 2 untuk cetak angka tiap baris
            for(int x = 1; x <= i; x++){
                System.out.print(x);
            }
            // pindah ke baris berikutnya setelah tiap baris
            System.out.println();
        }
    }
}