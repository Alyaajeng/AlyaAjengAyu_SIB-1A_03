import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Input data penonton");
                    System.out.println("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.println("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.println("Masukkan kolom: ");
                    kolom = sc.nextInt();

                    // Handle nomor baris/kolom tidak tersedia
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia");
                        continue;
                    }
                    penonton[baris - 1][kolom - 1] = nama;
                    break;

                case 2:
                    System.out.println("Daftar penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println(String.format("Daftar penonton baris ke-%d", i + 1));
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print(" *** ");
                            } else {
                                System.out.print(penonton[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }
            
        } while (!pilihan.equalsIgnoreCase("3"));

        do {
            System.out.println("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
        } while (next.equalsIgnoreCase("y"));
    }
}