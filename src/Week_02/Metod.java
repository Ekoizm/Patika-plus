package Week_02;
import java.util.Scanner;
public class Metod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        sequence(n);

    }
    public static void sequence(int num){

        if(num < 0 ){
            System.out.println(num + "");
            return;
        }else
        System.out.println(num + "");
        sequence( num - 5);
        System.out.println(num + "");
    }
}
