package Week_03.MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("---------------> Welcome to the Minesweeper ! <---------------------");
        System.out.println("-------> Please enter the sizes you want to play with ! <-------");
        do {

            System.out.print("Enter Number of Rows:");
            row = scanner.nextInt();
            System.out.print("Enter Number of Colums:");
            column = scanner.nextInt();
            if (row >= 2 && column >= 2) {
                MineSweeper mine = new MineSweeper(row, column);
                mine.run();
            } else {
                System.out.println("Lütfen 2x2 den büyük matris giriniz!");
            }

        } while (row < 2 || column < 2);
    }
}
