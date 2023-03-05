class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] tmp = new String[1];
        String[] arr = my_string.split("");
        tmp[0]= arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp[0];
        answer = String.join("", arr);
        return answer;
    }
}