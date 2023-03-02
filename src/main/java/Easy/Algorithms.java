package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

}
