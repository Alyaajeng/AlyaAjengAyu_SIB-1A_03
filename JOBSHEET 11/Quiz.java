import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka(1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();

                if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil!");
                } else if (answer > number) {
                    System.out.println("Tebakan Anda terlalu besar!");
                }

                success = (answer == number);
            } while (!success);
            System.out.println("Apakah Anda ingin mengulang permainan(Y/y)?");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}