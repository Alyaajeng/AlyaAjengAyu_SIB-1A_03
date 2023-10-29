import java.util.Scanner;

public class Lingkaran03 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        //Deklarasi
        int r;
        double keliling, luas;

        //Input
        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();
        
        //output
        keliling= 2*3.14*r;
        luas= 3.14*r*r;
        System.out.println("keliling lingkaran: " + keliling);
        System.out.println("luas lingkaran: " + luas);

    }
}