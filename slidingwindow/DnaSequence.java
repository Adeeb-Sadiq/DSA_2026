package slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DnaSequence {
    static void main() {
        String dna = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"; // 32
        List<String> result = repeatedDNASequence(dna);
        System.out.println(result);
    }

    public static List<String> repeatedDNASequence(String dna) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int window = 10;

        for(int i = 0; i <= dna.length() - window; i++) {
            String subset = dna.substring(i, i + window);
            if(seen.contains(subset)) {
                repeated.add(subset);
            } else {
                seen.add(subset);
            }
        }

        return new ArrayList<>(repeated);
    }
}
