package javas.ObjectOriented.ClassObject.BookStore;

public class BookStore {
    public static void main(String[] arg){
        Book book1 = new Book("Lisa Mona","Deep",20.00);
        Book book2 = new Book("Hola Mona","Deep",40.00);
        Book book3 = new Book("Jole Mona","Deep",90.00);

        book1.displayBook();
        System.out.println("-----------------");
        book2.displayBook();
        System.out.println("-----------------");
        book3.displayBook();
    }
}
