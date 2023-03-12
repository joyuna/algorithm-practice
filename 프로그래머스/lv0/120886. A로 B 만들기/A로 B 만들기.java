import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String bf = String.join("", beforeArr);
        String af = String.join("", afterArr);
        
        answer = bf.equals(af) ? 1 : 0;
        return answer;
    }
}