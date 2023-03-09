class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] arr = String.valueOf(num).split("");
        for(int i = 0; i < arr.length; i++) {
            if(Integer.valueOf(arr[i]) == k) {
                answer = i + 1;
                break;
            } 
        }
        if(answer == 0) {
            answer = -1;
        }
        return answer;
    }
}