import java.util.Scanner;
public class Segitiga03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas: ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);

    }
}
