class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string
            .replaceAll("a", "")
            .replaceAll("e", "")
            .replaceAll("i", "")
            .replaceAll("o", "")
            .replaceAll("u", "");
        return answer;
    }
}