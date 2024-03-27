package Week_05.MostUsedWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan veri girişi istedik
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni giriniz: ");
        String metin = scanner.nextLine();

        String[] kelimeler = metin.split("\\s+");

        Map<String, Integer> kelimeSayac = new HashMap<>();

        for (String kelime : kelimeler) {
            if (kelimeSayac.containsKey(kelime)) {
                kelimeSayac.put(kelime, kelimeSayac.get(kelime) + 1);
            } else {
                kelimeSayac.put(kelime, 1);
            }
        }

        // En çok tekrar eden kelimeyi bulma döngüsü
        String mostUsedWord = "";
        int mostUsedWordCount = 0;
        for (Map.Entry<String, Integer> entry : kelimeSayac.entrySet()) {
            if (entry.getValue() > mostUsedWordCount) {
                mostUsedWord = entry.getKey();
                mostUsedWordCount = entry.getValue();
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("En çok geçen kelime: " + mostUsedWord);
        System.out.println("Bu kelime " + mostUsedWordCount + " kez geçiyor.");
    }
}