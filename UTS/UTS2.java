import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai_math, nilai_fis, nilai_bing, nilai_bin;
        float rata_rata;
        String jurusan;

        System.out.println("Masukkan Nilai Matematika");
        nilai_math = input.nextInt();
        System.out.println("Masukkan nilai fisika");
        nilai_fis = input.nextInt();
        System.out.println("Masukkan Nilai Bahasa Inggris");
        nilai_bing = input.nextInt();
        System.out.println("Masukkan nilai bahasa Indonesia");
        nilai_bin = input.nextInt();
        
        System.out.println("Rata-Rata nilai calon mahasiswa baru adalah ");
        rata_rata = (nilai_math + nilai_fis + nilai_bing + nilai_bin / 4);
        System.out.println("Jurusan yang diterima di perguruan tinggi: ");
        jurusan = input.next();

        if ((jurusan == "IPA" || jurusan == "IPS") && nilai_math >= 80 && rata_rata >= 80 ) {
            System.out.println("Syarat masuk prodi D4 TI");
        } else if (jurusan == "IPA" && nilai_math >= 70 && nilai_fis >= 70 ) {
            System.out.println("Syarat masuk prodi D3 MI");
        } else if (jurusan == "BAHASA" && rata_rata > 80 && nilai_math >= 70 && nilai_bing >=70 && nilai_bin >= 70) {
            System.out.println("Syarat diterima D3 MI");
        } else {
            System.out.println("Tidak diterima");
        }
    }
}
