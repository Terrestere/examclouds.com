package Printable;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Name1");
        Book book1 = new Book("Name2");
        Magazine magazine = new Magazine("Magazine1");
        Magazine magazine1 = new Magazine("Magazine2");

        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Printing Newspaper");
            }
        };

        Printable[] printables = {book, book1, magazine, magazine1, newspaper};
        for (Printable str : printables) {
            str.print();
        }
    }
}
