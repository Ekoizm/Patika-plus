package Week_02;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i=2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(number + " sayısı ASALDIR");
        }
        else{
            System.out.println(number + " sayısı ASAL değildir");
        }
    }
}
