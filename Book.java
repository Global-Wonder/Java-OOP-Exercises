public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }

    void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args){
        Book book1 = new Book("Atomic Habits", "James Clear", 20);
        Book book2 = new Book("Can't Hurt Me", "David Goggins", 40);
        Book book3 = new Book("Angela Duckworth", "Grit", 50);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}
