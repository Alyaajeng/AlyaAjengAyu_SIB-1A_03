import java.util.Scanner;

public class PemilihanPercobaan2_03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.println("Nilai uas    :");
        float uas = input03.nextFloat();
        System.out.println("Niali uts    :");
        float uts = input03.nextFloat();
        System.out.println("Nilai kuis   :");
        float kuis = input03.nextFloat();
        System.out.println("Nilai tugas  :");
        float tugas = input03.nextFloat();
        float total = (uas * 0.4F) * (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

    }
}
