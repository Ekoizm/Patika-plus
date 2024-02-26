package Week_01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz: ");
        int n1 = input.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama işlemi sonucunuz: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucunuz: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucunuz: " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölme işlemi sonucunuz: " + (n1/n2));
                break;
            default:
                System.out.println("Hata! Lütfen tekrar deneyin");
                break;
        }
        System.out.println(select);
    }
}
