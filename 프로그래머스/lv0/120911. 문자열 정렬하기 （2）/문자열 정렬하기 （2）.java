import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        answer = new String(charArr);
        return answer;
    }
}