package Week_05.Try_Catch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array= {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Array Elemanları: ");
        printArray(array);

        System.out.println("Bir sayı giriniz  :");
        int x = scanner.nextInt();

        printIndexArray(array,x);
    }
    public static void printIndexArray(int[] arr,int index){

        try {
            System.out.print(arr[index]);
            System.out.println();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void printArray(int[] arr){
        for(int eleman : arr){
            System.out.print(eleman + " ");
        }
    }
}