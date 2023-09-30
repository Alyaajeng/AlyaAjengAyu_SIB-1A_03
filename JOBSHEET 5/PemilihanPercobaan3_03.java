import java.util.Scanner;

public class PemilihanPercobaan3_03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        System.out.println("Masukkan angka pertama: ");
        angka1 = input03.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input03.nextDouble();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input03.next().charAt(0);

    switch (operator) {
        case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + "=" + hasil);
        case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + "=" + hasil);
            break;
        case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + "=" + hasil);
            break;
        case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + "=" + hasil);
            break;
    }

    }
}
