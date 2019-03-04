package strsymmetrypoint;

class Solution {

    public static void main(String[] args) {
        System.out.print(solution("racecar"));

    }

    static int solution(String S) {

        int symmetryIndex = S.length() / 2;

        if (S.length() % 2 == 0)
            return -1;
        if (S.length() == 1)
            return 0;

        String firstHalf = S.substring(0, symmetryIndex);
        String secondHalf = S.substring(symmetryIndex + 1);
        String reverseSecondHalf = new StringBuffer(secondHalf).reverse().toString();

        if (firstHalf.equals(reverseSecondHalf)) {
            return symmetryIndex;
        } else {
            return -1;
        }

    }
}