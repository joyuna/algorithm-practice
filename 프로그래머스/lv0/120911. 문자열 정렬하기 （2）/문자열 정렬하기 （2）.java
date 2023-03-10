import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] charArr = my_string.toCharArray();
        Arrays.sort(charArr);
        answer = String.valueOf(charArr);
        return answer;
    }
}