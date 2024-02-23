package Week_01;
import java.util.Scanner;
public class TipDonusumleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan veri istendi
        System.out.println("Bir tam sayı giriniz:");
        int tamSayı = input.nextInt();
        System.out.println("Bir ondalık sayı giriniz:");
        double ondalıkSayı = input.nextDouble();

        //Alınan verinin dönüşümü yapıldı ve ekrana yazdırıldı
        System.out.println("Ondalıklı sayıya dönüşen tam sayınız:" + (double) tamSayı);
        System.out.println("Tam sayıya dönüşen ondalıklı sayınız:" + (int) ondalıkSayı);
    }
}
