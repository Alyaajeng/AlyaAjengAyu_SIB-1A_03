import java.util.Scanner;

public class ArrayTugass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Deklarasi variabel
        int n, i, nilaiTinggi, nilaiTerendah, jumlah;
        
        //Input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen : ");
        n = scan.nextInt();

        // Deklarasi array
        int [] array = new int [n];


        for (i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-"+(i+1)+" : ");
            array [i] = scan.nextInt();
        }

        //inisialisasi variabel
        nilaiTinggi = array[0];
        nilaiTerendah = array[0];
        jumlah = 0;

        //mencari nilai tertinggi
        for(i = 1; i < n; i++) {
            if (array [i] > nilaiTinggi) {
                nilaiTinggi = array[i];
            }
        }

        //mencari nilai terendah
        for (i = 0; i < n; i++) {
            jumlah += array[i];
        }
        float avg = jumlah / n;

        //output
        System.out.print("\nNilai tertinggi: "+nilaiTinggi+"\n ");
        System.out.print("Nilai terendah: "+nilaiTerendah+"\n ");
        System.out.print("Nilai rata-rata: "+avg+"\n ");

    }
}
