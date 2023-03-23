package removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FindDuplicatesUsingDistinctMethod {
    public static void main(String[] args) {
        // 1. list of Strings
        List<String> fangMangcompanies = new ArrayList<String>();
        // 1.1 add string elements to List
        fangMangcompanies.add("Meta");
        fangMangcompanies.add("Apple");
        fangMangcompanies.add("Amazon");
        fangMangcompanies.add("Netflix");
        fangMangcompanies.add("Meta"); // duplicate
        fangMangcompanies.add("Google");
        fangMangcompanies.add("Apple"); // duplicate
        System.out.println("1. Original List with duplicates : \n");
        fangMangcompanies.forEach(System.out::println);
        // 2. get unique elements after removing duplicates
        List<String> distinctCompanies = fangMangcompanies
                .stream()
                .distinct()
                .collect(Collectors.toList());
        // 2.1 print unique elements
        System.out.println("\n2. Unique elements : \n");
        distinctCompanies.forEach(System.out::println);

        // 3. get duplicate elements
        for (String distinctCompany : distinctCompanies) {
            fangMangcompanies.remove(distinctCompany);
        }

        // 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements : \n");
        fangMangcompanies.forEach(System.out::println);
    }
}

