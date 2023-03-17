class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        if(my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            }
        } else {
            answer = new String[my_str.length() / n + 1];
            for(int i = 0; i < answer.length; i++) {
                if(i != answer.length - 1) {
                    answer[i] = my_str.substring(i * n, (i + 1) * n);
                } else {
                    answer[i] = my_str.substring(i * n); 
                }
            }
        }
        return answer;
    }
}