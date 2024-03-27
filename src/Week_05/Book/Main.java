package Week_05.Book;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sefiller", 400);
        Book book2 = new Book("Beyaz Gemi", 350);
        Book book3 = new Book("Simyacı", 500);
        Book book4 = new Book("Şeker Portakalı", 300);
        Book book5 = new Book("Büyük Hizmetkar", 450);

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        TreeSet<Book> sortedByTitle = new TreeSet<>(bookSet);

        System.out.println("Kitaplar isimlerine göre sıralanmış:");
        for (Book book : sortedByTitle) {
            System.out.println(book);
        }

        TreeSet<Book> sortedByPageCount = new TreeSet<>(Comparator.comparing(Book::getPageCount));

        sortedByPageCount.addAll(bookSet);

        System.out.println("\nKitaplar sayfa sayısına göre sıralanmış:");
        for (Book book : sortedByPageCount) {
            System.out.println(book);
        }
    }
}