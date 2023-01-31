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
        String test = "hhaaaccckkkkeeerrrrrrraaaannnnkk";
        //when
        String actual = Strings.hackerrankInString(test);
        //then
        Assert.assertEquals(actual,"YES");
    }
}
