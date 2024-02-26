package Week_01;
import java.util.Scanner;
public class KBsıralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("Lütfen 3. sayıyı giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("c < b < a");
            } else {
                System.out.print("b < c < a");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("c < a < b");
            } else {
                System.out.print("a < c < b");
            }
        } else if ((c > b) && (c > a)) {
            if (a > b) {
                System.out.print("b < a < c");
            } else {
                System.out.print("a < b < c");
            }
        }
    }
}
