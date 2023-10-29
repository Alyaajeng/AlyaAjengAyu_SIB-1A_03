import java.util.Scanner;
public class UTS1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai_math, nilai_fis, nilai_bing, nilai_bin;
        float ratarata;

        System.out.println("Masukkan Nilai Matematika");
        nilai_math = input.nextInt();
        System.out.println("Masukkan nilai fisika");
        nilai_fis = input.nextInt();
        System.out.println("Masukkan Nilai Bahasa Inggris");
        nilai_bing = input.nextInt();
        System.out.println("Masukkan nilai bahasa Indonesia");
        nilai_bin = input.nextInt();

        //output 
        ratarata = (nilai_math + nilai_fis + nilai_bing + nilai_bin / 4);
        System.out.println("Rata-Rata nilai calon mahasiswa baru adalah " +ratarata);
    }
}

