package EasyTests;

import Easy.Algorithms;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AlgorithmsTest {
    @Test
    public void testSocksMerchant(){
        //given
        List<Integer> test = Arrays.asList(1,2,3,3);
        //when
        int actual = Algorithms.sockMerchant(test.size(),test);
        //then
        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testFindMinDays(){
        //given
        double[] test = new double[]{1.22, 1.02, 2.3};
        //when
        int actual = Algorithms.findMinDays(test);
        //then
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void binarySearch_whenElementIsPresent_returnsIndex(){
        int[] arr = {1,2,5,7,10};

        int actual = Algorithms.binarySearch(5,arr);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    void binarySearch_whenElementIsNotPresent_returnsNegativeOne(){
        int[] arr = {1,2,5,7,10};

        int actual = Algorithms.binarySearch(6,arr);

        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void binarySearch_whenElementIsPresentInEndIndex_returnsIndex(){
        int[] arr = {1,2,5,7,10};

        int actual = Algorithms.binarySearch(10,arr);

        assertThat(actual).isEqualTo(4);
    }

    @Test
    void binarySearch_whenArrayIsEmpty_returnsNegativeOne(){
        int[] arr = {};

        int actual = Algorithms.binarySearch(10,arr);

        assertThat(actual).isEqualTo(-1);
    }

}
