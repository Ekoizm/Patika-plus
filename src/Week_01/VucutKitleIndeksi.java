package Week_01;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks; //Değişkenleri tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri istedik
        System.out.print("Lütfen boyunuzu (metre cinsinden örn:1.85) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        //Girilen bilgiler ile formülümüzü uyguladık
        indeks = (kilo / (boy*boy));

        //Çıkan sonucu ekrana yazdırdık
        System.out.println("Vücut kütle indeksiniz " + indeks);

    }
}
