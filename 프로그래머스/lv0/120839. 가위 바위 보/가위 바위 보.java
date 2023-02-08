class Solution {
    public String solution(String rsp) {
        String answer = "";
        answer = rsp.replace("2", "7");
        answer = answer.replace("5", "2");
        answer = answer.replace("0", "5");
        answer = answer.replace("7", "0");
        return answer;
    }
}