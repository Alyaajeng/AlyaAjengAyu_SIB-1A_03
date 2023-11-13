import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] infoAkun = { // ID NAMA
                { "Ekal", "Moch. Haikal Putra Muhajir" }, { "Alya", "Alya Ajeng Ayu" },
                { "Erfin", "Erfin Jauhari Dwi Brian" }
        };
        int[][] nominal = { // PIN SALDO REKENING
                { 332005, 1000000, 760138001 }, { 181104, 1000000, 760218001 }, { 170405, 1000000, 760350001 }
        };
        boolean menu = false;
        boolean exitMenu = false;
        boolean online = true;
        int user = -1;
        while (online) {
            System.out.println("---------------------------------");
            System.out.println("  SELAMAT DATANG DI BANK JALI !");
            System.out.println("---------------------------------");
            while (!menu) {
                System.out.print("Masukkan ID Anda  : ");
                String inputId = scan.next();
                System.out.print("Masukkan PIN Anda : ");
                int inputPin = scan.nextInt();

                for (int i = 0; i < infoAkun.length; i++) {
                    if (inputId.equals(infoAkun[i][0]) && inputPin == nominal[i][0]) {
                        user = i;
                        System.out.println("\n------------------------------");
                        System.out.println("\tLogin Berhasil !");
                        System.out.println("------------------------------\n");
                        menu = true;
                        break;
                    } 
            } if (!menu) {
                        System.out.println("\n------------------------------");
                        System.out.println("\tLogin Gagal !");
                        System.out.println("------------------------------\n");
                }
            }
            while (menu) {
                System.out.println("====================================");
                System.out.println("     ||======================||");
                System.out.println("     ||     PILIHAN MENU     ||");
                System.out.println("     ||______________________||");
                System.out.println("     ||  1. Info Akun        ||");
                System.out.println("     ||  2. Tarik Tunai      ||");
                System.out.println("     ||  3. Setor Tunai      ||");
                System.out.println("     ||  4. Transfer Dana    ||");
                System.out.println("     ||  5. Pembayaran Lain  ||");
                System.out.println("     ||  6. Mutasi Rekening  ||");
                System.out.println("     ||  7. Ganti PIN        ||");
                System.out.println("     ||  8. Keluar           ||");
                System.out.println("     ||======================||");
                System.out.println("====================================");
                System.out.print("Masukkan Input : ");
                int pilihan = scan.nextInt();
                scan.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println("Nama      :" + infoAkun[user][1]);
                        System.out.println("Rekening  :" + nominal[user][2]);
                        System.out.println("Saldo Anda: Rp" + nominal[user][0]);
                        System.out.println("====================================");
                        exitMenu = true;
                        break;
                    case 2:
                        System.out.println("-----------------------------------------------------");
                        System.out.print("Jumlah Uang Yang Ingin Anda Tarik : Rp");
                        int tarik = scan.nextInt();
                        scan.nextLine();
                        if (tarik <= nominal[user][1] - 50000) {
                            if (tarik % 50000 == 0) {
                                nominal[user][1] -= tarik;
                                System.out.println("====================================");
                                System.out
                                        .println("Penarikan Tunai Berhasil !\nSisa saldo Anda : Rp" + nominal[user][1]);
                                System.out.println("====================================");
                                ;
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
                        if (setor % 50000 == 0) {
                            nominal[user][1] += setor;
                            System.out.println("Penyetoran Tunai Berhasil\nSisa saldo Anda : Rp" + nominal[user][1]);
                            System.out.println("====================================");
                            exitMenu = true;
                            break;
                        } else
                            System.out.println("-----------------------------------------------------");
                        System.out.println("Penyetoran tunai harus kelipatan Rp50.000");
                        exitMenu = true;
                        break;
                    case 4:
                        System.out.println("\n--------------------------------------------");
                    case 5:
                        System.out.println("\n--------------------------------------------");
                        System.out.println("Pilih Menu Pembayaran: ");
                        System.out.println("1. Listrik");
                        System.out.println("2. PDAM");
                        System.out.println("\n--------------------------------------------");
                        System.out.print("Masukan Input : ");
                        int menuPembayaran = scan.nextInt();
                        int min = 1000;
                        int max = 9999;
                        int random1 = (int)(Math.random() * (max - min + 1) + min);
                        int random2 = (int)(Math.random() * (max - min + 1) + min);
                        int random3 = (int)(Math.random() * (max - min + 1) + min);
                        int random4 = (int)(Math.random() * (max - min + 1) + min);
                        int random5 = (int)(Math.random() * (max - min + 1) + min);
                        
                        if (menuPembayaran == 1) {
                            System.out.println("\n------------------------------------");
                            System.out.println("\tPembayaran Listrik\n");
                            System.out.print("Masukkan Token Listrik      : ");
                            int tokenListrik = scan.nextInt();
                            System.out.print("Masukkan nominal Pembayaran : Rp.");
                            int nomPembayaranL = scan.nextInt();
                            
                            if (nomPembayaranL <= nominal[user][1]) {
                                nominal[user][1] -= nomPembayaranL;
                                System.out.println("-----------------------------------------------------");
                                System.out.println("\tPembayaran Listrik Berhasil\n");
                                System.out.println("Nomor Meter : " + tokenListrik);
                                System.out.println("Nominal     : " + nomPembayaranL);
                                System.out.printf("Token       : %d-%d-%d-%d-%d\n", random1, random2, random3, random4, random5);
                                System.out.println("Sisa saldo  : Rp." + nominal[user][1]);
                            } else {
                                System.out.println("Saldo Anda tidak mencukupi untuk pembayaran ini.");
                            }
                            exitMenu = true;
                            break;

                        } else if (menuPembayaran == 2) {
                            System.out.println("\n--------------------------------------------");
                            System.out.println("\tPembayaran PDAM\n");
                            System.out.print("Masukkan No.Pelanggan PDAM  : ");
                            int noPDAM = scan.nextInt();
                            System.out.print("Masukkan Nominal Pembayaran : Rp.");
                            int nomPembayaranP = scan.nextInt();

                             if (nomPembayaranP <= nominal[user][1]) {
                                nominal[user][1] -= nomPembayaranP;
                                System.out.println("-----------------------------------------------------");
                                System.out.println("\tPembayaran PDAM Berhasil\n");
                                System.out.println("No.Pelanggan : " + noPDAM);
                                System.out.println("Nominal      : " + nomPembayaranP);
                                System.out.println("Sisa saldo   : Rp." + nominal[user][1]);
                            } else {
                                System.out.println("Saldo Anda tidak mencukupi untuk pembayaran ini.");
                            }
                            exitMenu = true;
                            break;
                        } else {
                            System.out.println("Input tidak valid");
                            exitMenu = true;
                            break;
                        }
                    case 6:
                    case 7:
                        System.out.println("\n---------------------------------");
                        System.out.print("Masukkan PIN ATM baru: ");
                        int pinBaru = scan.nextInt();
                        if ( pinBaru >  999999 || pinBaru < 100000 ) {
                            System.out.println("PIN baru harus 6 digit");
                            exitMenu = true;
                            break;
                        }else if (pinBaru == nominal[user][0]) {
                            System.out.println("PIN lama dan PIN baru tidak boleh sama");
                            exitMenu = true;
                            break;
                        } else{
                            System.out.println("========================================");
                            System.out.println("PENGGANTIAN PIN BERHASIL !");
                            System.out.println("PIN ATM berhasil diganti menjadi " + pinBaru);
                            System.out.println("========================================");
                        nominal[user][0] = pinBaru;
                        exitMenu = true;
                        break;
                        }
                    case 8:
                        System.out.println("\n--------------------------------------------");
                        System.out.println("  TERIMAKASIH TELAH MENGGUNAKAN BANK JALI");
                        System.out.println("--------------------------------------------");
                        menu = false;
                        exitMenu = false;
                        online = false;
                        break;
                    default:
                        System.out.println("Harap Masukkan Menu Yang Valid !");
                        System.out.println("====================================");
                }
                while (exitMenu) {
                    scan.nextLine();
                    System.out.println("-----------------------------------------------------");
                    System.out.print("Apakah anda ingin melakukan transaksi lain (Y/T) ? : ");
                    char exit = scan.nextLine().charAt(0);
                    System.out.println("-----------------------------------------------------");
                    if (exit == 'y' || exit == 'Y') {
                        menu = false;
                        break;
                    } else if (exit == 't' || exit == 'T') {
                        String [][] keterangan = {
                                    {"Tarik Tunai" , ""} , {"Setor Tunai" , ""} , 
                                    {"Transfer Dana" , ""} , {"Pembayaran Lain" , ""}
                        };
                        // Cetak struk
                        System.out.println("------------------------------------------------");
                        System.out.println("            STRUK ATM BANK JALI");
                        System.out.println("------------------------------------------------");
                        System.out.println("Nama         : " + infoAkun[user][1]);
                        System.out.println("No Rekening  : " + nominal[user][2]);
                        System.out.println("Nominal      : Rp" + nominal[user][1]);
                        System.out.println("Keterangan   : " + keterangan[pilihan][0]);
                        System.out.println("------------------------------------------------");
                        exitMenu = true;
                        System.out.println("\n--------------------------------------------");
                        System.out.println("  TERIMAKASIH TELAH MENGGUNAKAN BANK JALI");
                        System.out.println("--------------------------------------------");
                        online = false;
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
}
