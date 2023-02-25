class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = Math.sqrt(n);
        if(result % 1 == 0.0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}