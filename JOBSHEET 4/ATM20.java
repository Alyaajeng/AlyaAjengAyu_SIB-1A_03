import java.util.Scanner;

public class ATM20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 800000000;
        String id;
        int tarik, pin;
        System.out.println("---------------------------------");
        System.out.println("  SELAMAT DATANG DI BANK JALI !");
        System.out.println("---------------------------------");
        System.out.print("Masukkan ID Anda : ");
        id = input.nextLine();
        System.out.print("\nMasukkan PIN Anda : ");
        pin = input.nextInt();
        System.out.print("\nSaldo Anda : Rp" + saldo);
        System.out.print("\nJumlah Uang yang Ingin Anda Tarik : Rp");
        tarik = input.nextInt();
        int saldoAkhir = saldo - tarik;
        System.out.printf("Penarikan Sejumlah Rp%d Berhasil !", tarik);
        System.out.print("\nSisa Saldo Anda : Rp" + saldoAkhir);
    }
}