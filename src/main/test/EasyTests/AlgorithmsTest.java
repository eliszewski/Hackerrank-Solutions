package EasyTests;

import Easy.Algorithms;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AlgorithmsTest {
    @Test
    public void testSocksMerchant(){
        //given
        List<Integer> test = Arrays.asList(1,2,3,3);
        //when
        int actual = Algorithms.sockMerchant(test.size(),test);
        //then
        Assert.assertEquals(actual,1);
    }

    @Test
    public void testFindMinDays(){
        //given
        double[] test = new double[]{1.22, 1.02, 2.3};
        //when
        int actual = Algorithms.findMinDays(test);
        //then
        Assert.assertEquals(actual,2);
    }



}
