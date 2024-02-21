package Week_01;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcının değerlerini al
        System.out.print("Matematik Notunuz");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        String geka = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(geka);


    }
}
