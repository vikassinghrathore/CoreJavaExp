package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Pencil", "A", 10),
                new Product(2, "Note Book", "A", 25),
                new Product(3, "Bag", "A", 170),
                new Product(4, "Pen", "A", 20),
                new Product(5, "Shoes", "B", 200),
                new Product(6, "T-Shirt", "B", 150),
                new Product(7, "Watch", "B", 120)
        );
        String targetCategory1 = "A"; int minPrice = 30;
        String targetCategory2 = "B"; int maxPrice = 170;
        List<Product> filteredProducts = products
                .stream()
                .filter(product -> (product.getCategory().equals(targetCategory1) && product.getPrice() > minPrice) ||
                                   (product.getCategory().equals(targetCategory2) && product.getPrice() > maxPrice))
                                   .collect(Collectors.toList());

        System.out.println("Products in category " + targetCategory1 + " with price > " + minPrice + " or " +
                "Products in category " + targetCategory2 + " with price > " + maxPrice + ":");
        filteredProducts.forEach(System.out::println);
    }
}

