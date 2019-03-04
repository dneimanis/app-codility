package minabssumoftwo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {

    @Test
    void should_return_zero_when_array_too_short() {
//        given
        int[] A = new int[]{};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(0, result);
    }

    @Test
    void should_return_zero() {
//        given
        int[] A = new int[]{-5, 5};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(0, result);
    }

    @Test
    void should_return_two() {
//        given
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(2, result);
    }

    @Test
    void should_return_three() {
//        given
        int[] A = new int[]{-8, 4, 5, -10, 3};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(3, result);
    }

}
