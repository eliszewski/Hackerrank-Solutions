package Easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Algorithms {
    public static int getNumOfPairs(List<Integer> list, int value){
        int counter = 0;
        for (int i : list
        ) {
            if(i == value){
                counter++;
            }
        }
        return (int) Math.floor(counter/2.0);
    }


    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> sockValues = new HashSet<>();
        int totalCount = 0;
        for (int i: ar
        ) {
            if(sockValues.add(i)) totalCount = totalCount + getNumOfPairs(ar,i);
        }
        return totalCount;
    }

    public static int findMinDays(double[] movies) {
        Arrays.sort(movies);
        int left = 0, right = movies.length - 1, days = 0;
        while (left <= right) {
            days++;
            if (movies[left] + movies[right] <= 3.0) {
                left++;
            }
            right--;
        }
        return days;
    }

    public static int saveThePrisoner(int prisoners, int candies, int startingPos) {
        return (candies + startingPos - 1) % prisoners != 0 
        ? (candies + startingPos - 1) % prisoners : prisoners;
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> counts = arr.stream()
                .collect(Collectors.groupingBy(x -> x , Collectors.counting()));
        Long maxI = counts.get(arr.get(0));
        Integer max = arr.get(0);
        for (Map.Entry<Integer, Long> entry: counts.entrySet()
             ) {
            if(entry.getValue() > maxI) {maxI = entry.getValue(); max = entry.getKey();}
            else if ((long) entry.getValue() == maxI && entry.getKey() < max) {
                maxI = entry.getValue(); max = entry.getKey();
            }
        }
        return max;
        }
        //determine front or back. subtract n / 2
        // find number of flips
        public static int pageCount(int n, int p) {
            int fromFront = p / 2;
            int fromBack = (n / 2) - (p / 2);
            return Math.min(fromFront, fromBack);
        }

}

