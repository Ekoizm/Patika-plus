package Week_01;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ürünlerin fiyat girişini yaptım
        double armutFiyat= 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11, muzFiyat = 0.95, patlıcanFiyat = 5.00 , hesap = 0.00;

        System.out.println("----------------------------" );
        System.out.println("Ürün Fiyat Listesi" );
        System.out.println("Armut = " + armutFiyat );
        System.out.println("Elma = " + elmaFiyat );
        System.out.println("Domates = " + domatesFiyat );
        System.out.println("Muz = " + muzFiyat );
        System.out.println("Patlıcan = " +  patlıcanFiyat );
        System.out.println("----------------------------" );

        System.out.print("Armut kaç kilo ? : ");
        double armutAl = input.nextDouble();
        hesap+= (armutAl * armutFiyat);

        System.out.print("Elma kaç kilo ? : ");
        double elmaAl = input.nextDouble();
        hesap+= (elmaAl * elmaFiyat);

        System.out.print("Domates kaç kilo ? : ");
        double domatesAl = input.nextDouble();
        hesap+= (domatesAl * domatesFiyat);

        System.out.print("Muz kaç kilo ? : ");
        double muzAl = input.nextDouble();
        hesap+= (muzAl * muzFiyat);

        System.out.print("Patlıcan kaç kilo ? : ");
        double patlıcanAl = input.nextDouble();
        hesap+= (patlıcanAl * patlıcanFiyat);

        System.out.println("----------------------------" );
        System.out.print("Toplam ücret tutarınız : " + hesap);
    }
}
