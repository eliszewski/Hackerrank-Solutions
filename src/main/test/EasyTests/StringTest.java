package EasyTests;

import Easy.Strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void testPangram(){
        //given
        String test = "The five boxing wizards jump quickly";
        //when
        String actual = Strings.pangrams(test);
        //then
        assertThat(actual).isEqualTo("pangram");
    }

    @Test
    void testhackerrankInString(){
        //given
        String test = "hhaaaccckkkkerrrrrrraaaannnnkk";
        //when
        String actual = Strings.hackerrankInString(test);
        //then
        assertThat(actual).isEqualTo("YES");

    }

    @Test
    void testRepeatedString(){
        //given
        String test = "aba";
        //when
        long actual = Strings.repeatedString(test, 10);
        //then
        assertThat(actual).isEqualTo(7);
    }

    @Test
    void isPalindrome_true(){
        //given
        String test = "aba";
        //when
        boolean actual = Strings.isPalindrome(test);
        //then
        assertThat(actual).isTrue();
    }

    @Test
    void isPalindrome_false(){
        //given
        String test = "zhg";
        //when
        boolean actual = Strings.isPalindrome(test);
        //then
        assertThat(actual).isFalse();
    }
}
