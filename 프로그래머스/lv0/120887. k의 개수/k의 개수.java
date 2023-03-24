class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int l = i; i <= j; i++) {
            str += String.valueOf(i);
        }
        String[] arr = str.split("");
        for(int m = 0; m < arr.length; m++) {
            if(arr[m].equals(String.valueOf(k))) {
                answer++;
            }
        }
        return answer;
    }
}