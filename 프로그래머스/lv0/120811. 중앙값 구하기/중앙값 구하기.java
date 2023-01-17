import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        answer = array[array.length / 2];
        
        return answer;
    }
}