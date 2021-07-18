import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Set<String> statesNeeded = new HashSet(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        Map<String, Set<String>> stations = new LinkedHashMap<>();
        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));
        HashSet<String> finalStations = new HashSet<>();

        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> entry : stations.entrySet()) {
                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(entry.getValue());

                if (covered.size() > statesCovered.size()) {
                    statesCovered = covered;
                    bestStation = entry.getKey();
                }
                statesNeeded.removeIf(statesCovered::contains);
            }


            if (bestStation != null) {
                finalStations.add(bestStation);
            }

        }
        System.out.println(finalStations);
    }
}
