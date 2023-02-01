class Solution {
    public String solution(int age) {
        String answer = "";
        char[] arr = String.valueOf(age).toCharArray();

        for(int i = 0; i < arr.length; i++) {
            answer += (char)(arr[i] + '1');
        }
        return answer;
    }
}