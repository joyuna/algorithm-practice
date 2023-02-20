class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] arr = message.split("");
        answer = arr.length * 2;
        return answer;
    }
}