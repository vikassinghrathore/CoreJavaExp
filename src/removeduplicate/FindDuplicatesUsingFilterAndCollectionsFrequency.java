package removeduplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingFilterAndCollectionsFrequency {
    public static void main(String[] args) {
        List<String> fangMangcompanies = new ArrayList<String>();
        fangMangcompanies.add("Meta");
        fangMangcompanies.add("Apple");
        fangMangcompanies.add("Amazon");
        fangMangcompanies.add("Netflix");
        fangMangcompanies.add("Meta"); // duplicate
        fangMangcompanies.add("Google");
        fangMangcompanies.add("Apple"); // duplicate
        System.out.println("1. Original List with duplicates : \n");
        fangMangcompanies.forEach(System.out::println);

        Set<String> distinctCompanies = fangMangcompanies
                .stream()
                .distinct()
                .collect(Collectors.toSet());
        // 2.1 print unique elements
        System.out.println("\n2. Unique elements : \n");
        distinctCompanies.forEach(System.out::println);

        Set<String> duplicateCompanies = fangMangcompanies
                .stream()
                .filter(company -> Collections.frequency(fangMangcompanies, company) > 1)
                .collect(Collectors.toSet());
        System.out.println("\n3. Duplicate elements : \n");
        duplicateCompanies.forEach(System.out::println);
    }
}
