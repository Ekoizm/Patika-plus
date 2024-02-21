package Week_01;
import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        //Hipotenus bulma

      /*  int kenar1, kenar2;
        double hipotenus;


        //Kullanıcının değerlerini al
        System.out.print("1. kenarı giriniz : ");
        kenar1 = input.nextInt();

        System.out.print("2. kenarı giriniz");
        kenar2 = input.nextInt();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs : " + hipotenus);
*/
        //Alan bulma

        int kenar1, kenar2, kenar3;
        double cevre,alan,u,formul,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        kenar1 = input.nextInt();

        System.out.print("2. kenarı giriniz : ");
        kenar2 = input.nextInt();

        System.out.print("3. kenarı giriniz : ");
        kenar3 = input.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2.0;

        cevre = (u) * 2.0;

        alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));

        System.out.println("Ucgenin cevresi : " + cevre);
        System.out.println("Ucgenin alani : " + alan);




    }
    }