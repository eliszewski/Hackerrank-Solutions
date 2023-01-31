package Easy;

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

}
