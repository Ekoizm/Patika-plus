package Week_01;

import java.util.Scanner;

public class Sınıfgecme {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcının değerlerini al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik);
        double sonuc = toplam / 5;
        System.out.println("Ortalamanız: " + sonuc);

        if(sonuc >=55){
            System.out.println("Tebrikler sınıfı geçtiniz");
        }else{
            System.out.println("Üzgünüz sınıftı geçemediniz ");
        }




    }
}
