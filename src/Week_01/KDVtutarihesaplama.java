package Week_01;
import java.util.Scanner;

public class KDVtutarihesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvTutar , kdvliTutar ;
        System.out.print("Ücret Tutarını Giriniz : " );
        tutar = input.nextDouble();

        double kdvOran = (tutar <= 1000) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutarı : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı : " + kdvliTutar);

    }
}
