package Week_01;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();
        int a = 0,b = 1,i = 0 ;

        while(i<n){
            System.out.println(a + "");
            int temp = a+b;
            a = b;
            b=temp;
            i++;
        }
}
}
