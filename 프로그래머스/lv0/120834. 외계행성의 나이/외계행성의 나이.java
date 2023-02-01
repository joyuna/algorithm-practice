class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = String.valueOf(age).split("");

        for(int i = 0; i < arr.length; i++) {
            answer += ((char)(Integer.valueOf(arr[i]) + 97));
        }
        return answer;
    }
}