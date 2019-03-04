package oddoccurrencesinarray;

public class Solution {

    public static void main(String[] args) {
        System.out.print(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));

    }

    static int solution(int[] A) {

        if (A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0];

        for (int i = 1; i < A.length; i++) {
            unpaired = unpaired ^ A[i];
        }

        return unpaired;
    }
}