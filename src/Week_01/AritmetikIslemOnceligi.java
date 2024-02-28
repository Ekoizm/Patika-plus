package Week_01;
import java.util.Scanner;
public class AritmetikIslemOnceligi {

    public static void main(String[] args) {

        int sayi1,sayi2,sayi3;
        double result;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girişi istendi
        System.out.print("1. sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        sayi3 = input.nextInt();

        //Sonuç için işlem önceliği formülü yazıldı
        result = sayi1 + sayi2 * sayi3 - sayi2;

        //Sonuç ekrana yazdırıldı
        System.out.println("Sonuç : " + result);

    }
}
