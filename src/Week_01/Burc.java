package Week_01;
import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int month , day;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğum ayınızı giriniz : ");
        month = input.nextInt();

        System.out.print("Lütfen doğum gününüzü giriniz : ");
        day = input.nextInt();

        if ((month == 3 && day >= 21) || (day == 4 && month <= 20)) {
            System.out.print("Koç burcusunuz ");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.print("Boğa burcusunuz ");
        }
        else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            System.out.print("İkizler burcusunuz ");
        }
        else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            System.out.print("Yengeç burcusunuz ");
        }
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.print("Aslan burcusunuz ");
        }
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.print("Başak burcusunuz ");
        }
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.print("Terazi burcusunuz ");
        }
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.print("Akrep burcusunuz ");
        }
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.print("Yay burcusunuz ");
        }
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            System.out.print("Oğlak burcusunuz ");
        }
        else if ((month == 1 && day >= 22) || (month == 2 && day <= 21)) {
            System.out.print("Kova burcusunuz ");
        }
        else if ((month == 2 && day >= 22) || (month == 3 && day <= 21)) {
            System.out.print("Balık burcusunuz ");
        }
        else {
            isError=true;
            System.out.print("Hatalı veri girdiniz ");
        }
    }
    }
