package Week_01;
import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        int r,a;
        double alan,cevre,p = 3.14,dilim;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarı çapı giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez açının ölçüsünü giriniz : ");
        a = input.nextInt();

        alan =(p * r * r);
        cevre = (p * r * 2);
        dilim = ((p * (r*r)*a) / 360);

        System.out.println("Ücgenin çevresi " + cevre);
        System.out.println("Ücgenin alanı " + alan);
        System.out.println("Ücgenin diliminin alanı " + dilim);
    }
}
