package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionsM {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupings = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!groupings.containsKey(sorted)) groupings.put(sorted, new ArrayList<>());
            groupings.get(sorted).add(str);
        }
        return new ArrayList<>(groupings.values());
    }
    /*
    should be faster in theory since counting every string is o(n)
    vs sorting (nlogn) with a constraint of < 100 char per string sorting isn't
    terrible I guess
     */
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<List<Integer>,List<String>> groupings = new HashMap<>();
        for (String str : strs) {
            int[] counts = getCounts(str);
            List<Integer> countList = Arrays.stream(counts).boxed().collect(Collectors.toList());
            if (groupings.containsKey(countList)) groupings.get(countList).add(str);
            else groupings.put(countList, new ArrayList<>(Collections.singleton(str)));
        }
        return new ArrayList<>(groupings.values());
    }

    private static int[] getCounts(String s) {
        int[] counts = new int[128];

        for (char c : s.toCharArray()) {
            counts[c]++;
        }

        return counts;
    }



    public static void main(String[] args) {
    }
}
