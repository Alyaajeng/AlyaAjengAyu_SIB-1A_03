import java.util.Scanner;

public class HargaBayar03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //Deklarasi
        int harga, jumlah, jumlahHal;
        double dis= 0.2, total, bayar, jmlDis;
        String merk;

        //Input
        System.out.print("Masukkan harga barang yang dibeli\t: ");
        harga=input.nextInt();
        System.out.print("Masukkan Jumlah barang yang dibeli\t: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan merk buku yang dibeli\t\t: ");
        merk=input.next();
        System.out.print("Masukkan jumlah halaman buku\t\t: ");
        jumlahHal=input.nextInt();

        //Output
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " + "Rp" + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + "Rp" + bayar);

    }
}
