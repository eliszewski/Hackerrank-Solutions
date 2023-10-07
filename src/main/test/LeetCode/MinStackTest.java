package LeetCode;

import leetcode.MinStack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinStackTest {
    private final MinStack subject = new MinStack();

    @Test
    public void getMinimum_standardData(){
        populateSubject(1,2,3);

        Integer actual = subject.getMinimum();

        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void getMinimum_zero(){
        populateSubject(0,0,0,0,0,0);

        Integer actual = subject.getMinimum();

        assertThat(actual).isEqualTo(0);
    }

    private void populateSubject(Integer... ints) {
        for (Integer integer: ints
             ) {
            subject.push(integer);
        }
    }
}
