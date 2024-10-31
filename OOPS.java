import java.util.*;

public class OOPS {

    static class Books {
        ArrayList<String> bookArr = new ArrayList<>();

        void addBook(String book) {
            this.bookArr.add(book);
        }

        void removeBook(String book) {
            this.bookArr.remove(book);
        }
//        @Override
//        public String toString() {
//            return "Books: " + bookArr;
//        }
    }

    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        String bookName = sc.nextLine();

        Books obj = new Books();
        obj.addBook(bookName);
        System.out.println("Enter the name of the book: ");
        obj.addBook(sc.nextLine());

        books.add(obj); // Add the Books object to the ArrayList

        // Display the contents of the ArrayList
        for (Books b : books) {
            System.out.println(b.bookArr);
        }

        //remove book from array
        System.out.println("Enter the name of the book to remove: ");
        obj.removeBook(sc.nextLine());
        for (Books b : books) {
            System.out.println(b.bookArr);
        }
        sc.close();
    }
}
