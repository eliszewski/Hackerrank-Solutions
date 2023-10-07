package LeetCode;

import leetcode.PalindromePermutation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromePermutationTest {
    private final PalindromePermutation subject = new PalindromePermutation();

    @Test
    public void hasPalindromePermutation_false(){
        String input = "kasldhjklasjdkasjdkjlkajsdkljgnbngbgfbgbgbgbsujdhrehfuehufhuloolplplnbhyjjjqqq";

        boolean actual = subject.hasPalindromePermutation(input);

        assertThat(actual).isEqualTo(false);
    }

    @Test
    public void hasPalindromePermutation_true(){
        String input = "aabbcck";

        boolean actual = subject.hasPalindromePermutation(input);

        assertThat(actual).isEqualTo(true);
    }
}
