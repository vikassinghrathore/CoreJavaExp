package removeduplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingFilterAndSetAddMethod {
    public static void main(String[] args) {
        List<String> fangMangcompanies = new ArrayList<String>();
        fangMangcompanies.add("Meta");
        fangMangcompanies.add("Apple");
        fangMangcompanies.add("Amazon");
        fangMangcompanies.add("Netflix");
        fangMangcompanies.add("Meta"); // duplicate
        fangMangcompanies.add("Google");
        fangMangcompanies.add("Apple"); // duplicate

        Set<String> distintCompanies = new HashSet<String>();
        //get duplicate
        Set<String> duplicatecompanies = fangMangcompanies
                .stream()
                .filter(com -> !distintCompanies.add(com))
                .collect(Collectors.toSet());
        System.out.println("Duplicate Elements: \n ");
        duplicatecompanies.forEach(System.out::println);
    }
}