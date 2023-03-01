import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String[] arr = my_string.replaceAll("[a-z]", "").split("");
        answer = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();        
        Arrays.sort(answer);
        return answer;
    }
}