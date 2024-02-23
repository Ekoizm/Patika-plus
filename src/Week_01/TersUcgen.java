package Week_01;
import java.util.Scanner;
public class TersUcgen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Basamak Sayısı Giriniz :");
            int basamak = scanner.nextInt();

            for (int i = basamak; i>=1 ; i--) {

                //Boşluk ekleme
                for (int j = 0; j < basamak - i; j++) {
                    System.out.print(" ");
                }

                // Yıldızlar ekleme
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                // Bir alt satıra geçiyoruz
                System.out.println();

            }
        }
    }

