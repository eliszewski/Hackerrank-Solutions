package StringTest;

import Easy.Strings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringTest {

    @Test
    public void testPangram(){
        //given
        String test = "The five boxing wizards jump quickly";
        //when
        String actual = Strings.pangrams(test);
        //then
        Assert.assertEquals(actual,"pangram");
    }

    @Test
    public void testhackerrankInString(){
        //given
        String test = "hhaaaccckkkkerrrrrrraaaannnnkk";
        //when
        String actual = Strings.hackerrankInString(test);
        //then
        Assert.assertEquals(actual,"YES");
    }

    @Test
    public void testRepeatedString(){
        //given
        String test = "aba";
        //when
        long actual = Strings.repeatedString(test, 10);
        //then
        Assert.assertEquals(actual,7);
    }
}
