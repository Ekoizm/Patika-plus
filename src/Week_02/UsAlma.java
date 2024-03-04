package Week_02;
import java.util.Scanner;
public class UsAlma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üs alınacak Sayı: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        int sonuc = 1;

        int i = 1;
        while(i <=us) {
            sonuc = sonuc * taban;
            i++;
            }
        System.out.print("Sonuç: " + sonuc);
        }
    }

