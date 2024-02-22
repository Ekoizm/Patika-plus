package Week_01;

import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {
        int year, zodyakf;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri istedik
        System.out.print("Lütfen doğum yılınızı giriniz : ");
        year = input.nextInt();

        zodyakf = year % 12;


        //Zodyak hayvanlarını içeren swicth-case dizisi
        String zodyak;

        switch (zodyakf) {
            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Tavşan";
                break;
            case 7:
                zodyak = "Ejderha";
                break;
            case 8:
                zodyak = "Yılan";
                break;
            case 9:
                zodyak = "At";
                break;
            case 10:
                zodyak = "Koyun";
                break;
            case 11:
                zodyak = "Tavuk";
                break;
            default:
                zodyak = "Geçersiz";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
    }
}
