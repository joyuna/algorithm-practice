import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int minAbs = Math.abs(n - array[0]);
        int minValue = array[0];

        for(int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[i]) < minAbs) {
                minAbs = Math.abs(n - array[i]);
                minValue = array[i];
            };
        }
        answer = minValue;
        return answer;
    }
}