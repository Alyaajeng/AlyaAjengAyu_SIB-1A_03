import java.util.Scanner;

public class StrukATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Data transaksi
        String nama = "Ekal";
        String id = "332005";
        int nominal = 100000;
        String keterangan = "Penarikan Tunai";

        // Cetak struk
        System.out.println("------------------------------------------------");
        System.out.println("            STRUK ATM BANK JALI");
        System.out.println("------------------------------------------------");
        System.out.println("Nama         : " + nama);
        System.out.println("ID           : " + id);
        System.out.println("Nominal      : Rp" + nominal);
        System.out.println("Keterangan   : " + keterangan);
        System.out.println("------------------------------------------------");
    }
}
