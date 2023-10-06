package EasyTests;

import Easy.Strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    public void testPangram(){
        //given
        String test = "The five boxing wizards jump quickly";
        //when
        String actual = Strings.pangrams(test);
        //then
        assertThat(actual).isEqualTo("pangram");
    }

    @Test
    public void testhackerrankInString(){
        //given
        String test = "hhaaaccckkkkerrrrrrraaaannnnkk";
        //when
        String actual = Strings.hackerrankInString(test);
        //then
        assertThat(actual).isEqualTo("YES");

    }

    @Test
    public void testRepeatedString(){
        //given
        String test = "aba";
        //when
        long actual = Strings.repeatedString(test, 10);
        //then
        assertThat(actual).isEqualTo(7);
    }
}
