package Week_01;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girişi istendi
        System.out.println("Yıl Giriniz : ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.print(year + " Bir artık yıldır ");
        }
        else if(year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " Bir artık yıldır");
        }
        else  {
            System.out.println(year + " Bir artık yıl değildir");
        }
    }
}
