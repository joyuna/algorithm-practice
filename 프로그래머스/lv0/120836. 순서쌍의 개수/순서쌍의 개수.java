class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0 ) {   
                answer++;
                if(i * i < n) {
                    answer++;                 
                }
            }
        }
        return answer;
    }
}