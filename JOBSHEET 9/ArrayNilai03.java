import java.util.Scanner;

public class ArrayNilai03 {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = scan.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            } else if (nilaiAkhir[i] < 70) {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }

    }
    
}
