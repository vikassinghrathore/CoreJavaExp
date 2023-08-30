package sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CombinedSortingLogic3 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Book C", "Author B", 15.99, 3));
        bookList.add(new Book(2, "Book A", "Author C", 12.99, 2));
        bookList.add(new Book(3, "Book B", "Author A", 20.99, 5));
        // Define custom comparators for each sorting criteria
        Comparator<Book> nameComparatpr=Comparator.comparing(book -> book.name);
        Comparator<Book> costComparatpr=Comparator.comparing(book -> book.cost);
        Comparator<Book> authorComparatpr=Comparator.comparing(book -> book.author);
        //combine the comparators thenComparing()
        Comparator<Book> combinedComparatpr=nameComparatpr.thenComparing(costComparatpr).thenComparing(authorComparatpr);

        Collections.sort(bookList,combinedComparatpr);// Sort the bookList using the combined comparator

        for (Book book : bookList) {// Print the sorted bookList
            System.out.println("Book ID: " + book.id + ", Name: " + book.name + ", Author: " + book.author + ", Cost: " + book.cost);
        }
    }
}
