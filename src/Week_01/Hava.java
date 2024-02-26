package Week_01;

import java.util.Scanner;
public class Hava {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık bilgisi giriniz : ");
        heat = input.nextInt();

        if (heat <5){
            System.out.print("Kayak yapabilirsiniz ");
        }else if (heat>=5 && heat<=15){
            System.out.print("Sinemaya gidebilirsiniz ");
        }if (heat>=15 && heat<=25){
            System.out.print("Piknik yapabilirsiniz ");
        }else if (heat >25){
            System.out.print("Yüzme etkinliği yapabilirsiniz ");
        }

    }
}
