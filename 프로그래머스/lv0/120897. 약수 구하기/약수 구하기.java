import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                list.add(n / i);
                if(n / i != i) {
                    list.add(i);
                }
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}