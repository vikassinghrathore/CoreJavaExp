package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CombinedSortingLogic1 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Book C", "Author B", 15.99, 3));
        bookList.add(new Book(2, "Book A", "Author C", 12.99, 2));
        bookList.add(new Book(3, "Book B", "Author A", 20.99, 5));

       // The thenComparing method is directly applied to the Comparator instance returned by Comparator.comparingDouble()
       // and reversed for the cost comparison. This makes the code more concise while achieving the same combined sorting logic.
        List<Book> sortedBookList = bookList
                .stream().sorted(Comparator.comparing(Book::getName).thenComparing(Comparator.comparingDouble(Book::getCost).reversed())
                .thenComparing(Book::getAuthor)).collect(Collectors.toList());
       sortedBookList.forEach(book -> System.out.println("Book ID: " + book.id + ", Name: " + book.name + ", Author: " + book.author + ", Cost: " + book.cost));
        //sortedBookList.forEach(System.out::println);
    }
}
