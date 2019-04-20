package strsymmetrypoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void should_return_negative_when_even() {
//         given
        String S = "four";
//        when
        int result = Solution.solution(S);
//        then
        assertEquals(-1, result);
    }
    
    @Test
    void should_return_zero_when_too_short() {
//         given
        String S = "f";
//        when
        int result = Solution.solution(S);
//        then
        assertEquals(0, result);
    }

    @Test
    void should_return_negative_when_no_symmetry() {
//         given
        String S = "test1";
//        when
        int result = Solution.solution(S);
//        then
        assertEquals(-1, result);
    }

    @Test
    void should_return_positive_when_odd_and_symmetric() {
//         given
        String S = "AMANAPLANACANALPANAMA";
//        when
        int result = Solution.solution(S);
//        then
        assertTrue(0 < result);
    }


}
