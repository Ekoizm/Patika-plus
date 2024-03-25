package Week_03.MineSweeper;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class MineSweeper {
    // Oyun alanının satır ve sütun sayıları
    int rowNumber, colNumber;

    // Mayınların yerini tutan harita ve kullanıcının oyun tahtasını tutan matris
    int[][] map;
    int[][] board;

    // Oyun alanının toplam hücre sayısı
    int size;

    // Oyun durumu (true: devam ediyor, false: oyun bitmiş)
    boolean game = true;

    // Rastgele sayı üretmek için Random sınıfı
    Random rand = new Random();

    // Kullanıcıdan giriş almak için Scanner sınıfı
    Scanner scanner = new Scanner(System.in);

    // Daha önce seçilen koordinatları takip etmek için küme
    Set<String> chosenCoordinates = new HashSet<>();

    // Mayın Tarlası oyununu başlatan kurucu metod
    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    // Oyunu başlatan ve oyun döngüsünü çalıştıran metod
    public void run() {
        int row, col, success = 0;
        prepareGame(); // Mayınları yerleştir
        printScreen(map); // Oyuncuya hangi hücrelerde mayın olduğunu göster
        System.out.println("Game has started !");
        while (game) {
            printScreen(board); // Oyuncunun tahtasını göster
            System.out.print("Row :");
            row = scanner.nextInt();
            System.out.print("Col :");
            col = scanner.nextInt();
            if (isValidCoordinate(row, col)) {
                String coordinateKey = row + "-" + col;
                if (chosenCoordinates.contains(coordinateKey)) {
                    System.out.println("This coordinate has been selected before, enter another coordinate.");
                } else {
                    chosenCoordinates.add(coordinateKey);

                    if (map[row][col] != -1) {
                        checkMine(row, col);
                        success++;
                        if (success == (size - (size / 4))) {
                            System.out.println("Congratulations. You won the game.");
                            break;
                        }
                    } else {
                        game = false;
                        System.out.println("Game Over! You stepped on a mine!");
                    }
                }
            } else {
                System.out.println("Invalid coordinate!");
            }
        }
    }

    // Verilen koordinatların geçerli olup olmadığını kontrol eden yardımcı metod
    private boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < rowNumber && col >= 0 && col < colNumber;
    }

    // Verilen hücredeki mayınları kontrol eden ve tahtayı güncelleyen metod
    public void checkMine(int r, int c) {
        if (map[r][c] != -1) {
            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && map[r - 1][c] == -1) {
                board[r][c]++;
            }
            if ((c > 0) && map[r][c - 1] == -1) {
                board[r][c]++;
            }
            if ((r > 0 && c > 0) && map[r - 1][c - 1] == -1) {
                board[r][c]++;
            }
            if ((r > 0 && c < colNumber - 1) && map[r - 1][c + 1] == -1) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1 && c > 0) && map[r + 1][c - 1] == -1) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1 && c < colNumber - 1) && map[r + 1][c + 1] == -1) {
                board[r][c]++;
            }
        }
    }

    // Oyun alanını mayınlarla dolduran metod
    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    // Verilen matrisi ekrana yazdıran metod
    public void printScreen(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == -1) {
                    System.out.print("* "); // Mayın hücresi
                } else if (board[i][j] == 0) {
                    System.out.print("- "); // Kapalı hücre
                } else {
                    System.out.print(board[i][j] + " "); // Açık hücre
                }
            }
            System.out.println();
        }
    }
}