class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(letter)) {
                answer += arr[i];
            }
        }
        return answer;
    }
}