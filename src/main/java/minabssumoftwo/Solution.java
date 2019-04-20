package minabssumoftwo;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.print(solution(new int[]{1, 4, -3}));
        
    }

    static int solution(int[] A) {
        int solution = Integer.MAX_VALUE;
        Arrays.sort(A);
        if (A.length > 1) {
            for (int number : A) {
                int index = Arrays.binarySearch(A, -number);
                if (index < 0) {
                    index = -1 - index;
                }
                if (index < A.length) {
                    solution = Math.min(solution, Math.abs(number + A[index]));
                }
                if (index > 1) {
                    solution = Math.min(solution, Math.abs(number + A[index - 1]));
                }
            }
            return solution;
        } else {
            return 0;
        }
    }
}
