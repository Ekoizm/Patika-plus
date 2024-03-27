package Week_05.Book;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    // Constructor
    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // toString metodu override ediliyor
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}

