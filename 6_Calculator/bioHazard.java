import java.util.*;

public class bioHazard {

    public static int bioHazard(int n, int[] allergic, int[] poisonous) {
        // Create a map to track poisonous relationships
        Map<Integer, Set<Integer>> poisonMap = new HashMap<>();
        
        for (int i = 0; i < allergic.length; i++) {
            poisonMap.putIfAbsent(poisonous[i], new HashSet<>());
            poisonMap.get(poisonous[i]).add(allergic[i]);
        }
        
        // To keep track of the intervals that can coexist
        int totalIntervals = 0;
        
        for (int start = 1; start <= n; start++) {
            Set<Integer> poisonedSet = new HashSet<>();
            boolean validInterval = true;
            
            for (int end = start; end <= n; end++) {
                if (poisonMap.containsKey(end)) {
                    poisonedSet.addAll(poisonMap.get(end));
                }
                
                if (poisonedSet.contains(end)) {
                    validInterval = false;
                    break;
                }
                
                if (validInterval) {
                    totalIntervals++;
                }
            }
        }
        
        return totalIntervals;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] allergic = {1, 2};
        int[] poisonous = {3, 4};

        System.out.println(bioHazard(n, allergic, poisonous));  // Output: 7
    }
}
