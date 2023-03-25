import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Arrays.sort(spell);
        
        for(int i = 0 ;i < dic.length; i++) {
            String dicValue = dic[i];
            String[] dicValueArr = dicValue.split("");
            Arrays.sort(dicValueArr);
            if(Arrays.equals(spell, dicValueArr)) {
                answer = 1;
            }
        } 
        answer = answer != 0 ? 1 : 2;
        return answer;
    }
}