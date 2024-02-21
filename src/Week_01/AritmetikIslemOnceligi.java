package Week_01;
import java.util.Scanner;
public class AritmetikIslemOnceligi {

    public static void main(String[] args) {

        int sayi1,sayi2,sayi3;
        double sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        sayi3 = input.nextInt();

        sonuc = sayi1 + sayi2 * sayi3 - sayi2;

        System.out.println("Sonuç : " + sonuc);

    }
}
