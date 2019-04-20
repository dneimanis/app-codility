package oddoccurrencesinarray;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {

    @Test
    void should_return_zero_when_empty() {
//        given
        int[] A = new int[]{};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(0, result);
    }

    @Test
    void should_return_zero_when_array_not_odd() {
//        given
        int[] A = new int[]{1, 1};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(0, result);
    }

    @Test
    void should_return_unpaired_element_when_only_one_unpaired() {
//        given
        int[] A = new int[]{1, 1, 5, 5, 6, 8, 8};
//        when
        int result = Solution.solution(A);
//        then
        assertEquals(6, result);
    }

}
