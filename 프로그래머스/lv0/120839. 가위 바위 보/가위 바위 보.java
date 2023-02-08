class Solution {
    public String solution(String rsp) {
        String answer = "";
        answer = rsp.replace("2", "7").replace("5", "2").replace("0", "5").replace("7", "0");
        return answer;
    }
}