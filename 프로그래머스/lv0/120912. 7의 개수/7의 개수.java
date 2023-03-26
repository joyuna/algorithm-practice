import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x + ", " + y)
                .get();
        String[] strArr = str.split("");
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("7")) {
                answer++;
            }
        }
        
        return answer;
    }
}