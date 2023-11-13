import java.util.Scanner;

public class SegitigaBintang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print untuk memasukkan nilai
        System.out.print("Masukkan Nilai N : ");
        //  input variabel n
        int n = sc.nextInt();

        // outer loop untuk setiap baris
        for(int i = n; i > 0; i--){
            // inner loop untuk print "*" di setiap baris
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            // pindah ke baris berikutnya setelah setiap baris
            System.out.println();
        }
    }
}