package Week_01;

import java.util.Scanner;


public class MinVeMaxDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz : ");
        int a = input.nextInt();
        int buyukSayi = 0;
        int kucukSayi = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println(i + ". Sayıyı Giriniz: ");
            int sayi = input.nextInt();
            if (sayi>buyukSayi){
                buyukSayi = sayi;
            }
            else if (sayi<kucukSayi){
                kucukSayi = sayi;
            }
        }
        System.out.println("En büyük sayı: " + buyukSayi);
        System.out.println("En küçük sayı: " + kucukSayi);

    }
}
