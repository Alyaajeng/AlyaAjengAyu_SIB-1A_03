import java.util.Scanner;

public class ModifikasiLingkaran03 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        //Deklarasi
        int r;
        double keliling, luas, phi=3.14;

        //Input
        System.out.println("Masukkan jari-jari lingkaran");
        r=input.nextInt();
        keliling= 2*phi*r;
        luas= phi*r*r;

        //output
        System.out.println("keliling lingkaran: " + keliling);
        System.out.println("luas lingkaran: " + luas);

    }
}