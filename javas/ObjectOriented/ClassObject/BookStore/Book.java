package javas.ObjectOriented.ClassObject.BookStore;

public class Book {
    String title;
    String author;
    Double price;

    Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
        System.out.println("Book is Expensive: "+(this.isExpensive()?"Yes":"No"));
    }

    boolean isExpensive(){
        return this.price>=500;
    }
}
