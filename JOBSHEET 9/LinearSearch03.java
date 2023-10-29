import java.util.Scanner;

public class LinearSearch03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah elemen Array : ");
        int jmlelemen = scan.nextInt();
        int[] arrayInt = new int[jmlelemen];
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i + " : ");
            arrayInt[i] = scan.nextInt();
        }
        System.out.print("Masukkan Key yang ingin Anda cari : ");
        int key = scan.nextInt();
        for (int i = 0; i < arrayInt.length; i++){
        if (arrayInt[i] == key) {
            hasil = i;
            break;
        }
    }
    if (hasil == -1) {
        System.out.println("Key tidak ditemukan");
    } else {
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }
    } 
}
