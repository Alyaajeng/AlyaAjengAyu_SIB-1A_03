import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = 800000000;
        String id = "Ekal";
        int pin = 332005;
        int uang = 500000;
        boolean menu = false;
        boolean exitMenu = false;
        System.out.println("---------------------------------");
        System.out.println("  SELAMAT DATANG DI BANK JALI !");
        System.out.println("---------------------------------");
        do {
            System.out.print("Masukkan ID Anda  : ");
            String inputId = scan.next();
            System.out.print("Masukkan PIN Anda : ");
            int inputPin = scan.nextInt();
            if (inputId.equals(id) && inputPin == pin) {
                System.out.println("\n------------------------------");
                System.out.println("\tLogin Berhasil !");
                System.out.println("------------------------------\n");
                menu = true;
                break;
            } else
                System.out.println("\n------------------------------");
            System.out.println("\tLogin Gagal !");
            System.out.println("------------------------------\n");
        } while (!menu);
        while (menu) {
            System.out.println("================================");
            System.out.println("     ||==================||");
            System.out.println("     ||   PILIHAN MENU   ||");
            System.out.println("     ||__________________||");
            System.out.println("     ||  1. Cek Saldo    ||");
            System.out.println("     ||  2. Tarik Tunai  ||");
            System.out.println("     ||  3. Setor Tunai  ||");
            System.out.println("     ||  4. Keluar       ||");
            System.out.println("     ||==================||");
            System.out.println("================================");
            System.out.print("Masukkan Input : ");
            int pilihan = scan.nextInt();
            scan.nextLine();
            
            switch (pilihan) {
                case 1:
                System.out.println("Saldo Anda: Rp" + saldo);
                System.out.println("================================");
                exitMenu = true;
                break;
                case 2:
                System.out.println("-----------------------------------------------------");
                System.out.print("Jumlah Uang Yang Ingin Anda Tarik : Rp");
                int tarik = scan.nextInt();
                scan.nextLine();
                    if (tarik <= saldo - 50000) {
                        if (tarik % 50000 == 0) {
                            saldo -= tarik;
                            uang += tarik;
                            System.out.println("================================");
                            System.out.println("Penarikan Tunai Berhasil !\nSisa saldo Anda : Rp" + saldo +
                                    "\nSisa uang anda : Rp" + uang);
                            System.out.println("================================");
                            exitMenu = true;
                            break;
                        } else
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Penarikan tunai harus kelipatan Rp50.000");
                            exitMenu = true;
                            break;
                    } else
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Saldo Anda Tidak Mencukupi");
                        exitMenu = true;
                        break;
                case 3:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Jumlah uang yang ingin Anda setorkan : Rp");
                    int setor = scan.nextInt();
                    scan.nextLine();
                    if (setor <= uang - 50000) {
                        if (setor % 50000 == 0) {
                            saldo += setor;
                            uang -= setor;
                            System.out.println("Penyetoran Tunai Berhasil\nSisa saldo Anda : Rp" + saldo +
                                    "\nSisa uang anda : Rp" + uang);
                            System.out.println("================================");
                            exitMenu = true;
                            break;
                        } else
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Penyetoran tunai harus kelipatan Rp50.000");
                            exitMenu = true;
                            break;
                    } else
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Uang Anda Tidak Mencukupi");
                        exitMenu = true;
                    break;
                case 4:
                    /*System.out.println("\n--------------------------------------------");
                    System.out.println("  TERIMAKASIH TELAH MENGGUNAKAN BANK JALI");
                    System.out.println("--------------------------------------------");
                    menu = false;*/
                    exitMenu = true;
                    break;
                default:
                    System.out.println("Harap Masukkan Menu Yang Valid !");
                    System.out.println("================================");
            }
            while (exitMenu) {
                System.out.println("-----------------------------------------------------");
                System.out.print("Apakah anda ingin melakukan transaksi lain (Y/T) ? : ");
                char exit = scan.nextLine().charAt(0);
                System.out.println("-----------------------------------------------------");
                if (exit == 'y' || exit == 'Y') {
                    break;
                } else if (exit == 't' || exit == 'T') {
                    System.out.println("\n--------------------------------------------");
                    System.out.println("  TERIMAKASIH TELAH MENGGUNAKAN BANK JALI");
                    System.out.println("--------------------------------------------");
                    menu = false;
                    break;
                } else {
                    System.out.println("---------------------------------");
                    System.out.println("Masukkan input yang valid (Y/T) !");
                    System.out.println("---------------------------------");
                }
            }
        }
    }
}
