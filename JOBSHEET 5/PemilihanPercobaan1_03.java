import java.util.Scanner;

public class PemilihanPercobaan1_03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in); 
        
        System.out.println("Masukkan angka:  ");
        int angka = input03.nextInt();
        
        // if (angka % 2 == 0) {
        //     System.out.println("Angka "+angka+" bilangan genap");
        // } else {
        //     System.out.println("Angka "+angka+" bilangan ganjil");
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
        }

        }
