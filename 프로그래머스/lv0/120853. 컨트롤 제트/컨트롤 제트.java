class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        answer += Integer.parseInt(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}