package Week_01;
import java.util.Scanner;


public class UcakBilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Kullanıcıdan veri bilgisi istedik
        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();
        double birimFiyat = 0.10;
        double ucret = mesafe * birimFiyat;


        //Bilet fiyatı hesaplama metodumuz
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                ucret *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                ucret *= 0.9;
            } else if (yas >= 65) {
                ucret *= 0.7;
            }
            if (yolculukTipi == 2) {
                ucret *= 0.8;
            } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
            System.out.println("Toplam Tutar: " + ucret + " TL");
        }
    }
}
