package removeduplicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// using Collectors.toMap() and Math::addExact
//using Collectors.toMap() and Integer::sum
//using Collectors.toMap() and Long::sum
public class FindDuplicateCountUsingCollectorsToMap1 {
    public static void main(String[] args) {
        List<String> fangMangcompanies = new ArrayList<String>();
        fangMangcompanies.add("Meta");
        fangMangcompanies.add("Apple");
        fangMangcompanies.add("Amazon");
        fangMangcompanies.add("Netflix");
        fangMangcompanies.add("Meta"); // duplicate
        fangMangcompanies.add("Google");
        fangMangcompanies.add("Apple"); // duplicate
        // 2. get duplicate count using Map
        // Map<String, Integer> duplicateCountMap = fangMangcompanies
        Map<String, Long> duplicateCountMap = fangMangcompanies
                .stream()
                .collect(
                        //Collectors.toMap(Function.identity(), company -> 1, Math::addExact));
                        //Collectors.toMap(Function.identity(), company -> 1, Integer::sum));
                        Collectors.toMap(Function.identity(), company -> 1L, Long::sum));
        // 2.1 print Map for duplicate count
        System.out.println("\n2. Map with Key and its duplicate count : \n");
        duplicateCountMap.forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
        );
    }
}