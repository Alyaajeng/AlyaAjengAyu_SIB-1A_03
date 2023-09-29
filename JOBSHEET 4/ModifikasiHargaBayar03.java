import java.util.Scanner;

public class ModifikasiHargaBayar03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Deklarasi
        int harga, jumlah, jumlahHal; 
        double dis, total, bayar, jmlDis;
        String merk;

        //Inputan
        System.out.print("Masukkan harga barang yang dibeli\t: ");
        harga=input.nextInt();
        System.out.print("Masukkan Jumlah barang yang dibeli\t: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan merk buku yang dibeli\t\t: ");
        merk=input.next();
        System.out.print("Masukkan jumlah halaman buku\t\t: ");
        jumlahHal=input.nextInt();
        System.out.println("Masukkan besar diskon\t\t: ");
        dis=input.nextDouble();

        //Output
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Total harga barang yang Anda beli adalah " + "Rp" + total);
        System.out.println("Diskon yang anda dapatkan adalah " + "Rp" + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + "Rp" + bayar);

    }
}
