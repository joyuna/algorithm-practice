class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] tmp = new String[1];
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        tmp[0]= arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp[0];
        
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}