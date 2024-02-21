package Week_01;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20 , total , startPrice = 1 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafei KM cinsinden giriniz :");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar :" + total);
    }
}
