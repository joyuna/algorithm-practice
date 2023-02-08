class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
                          "....","..",".---","-.-",".-..","--","-.",
                          "---",".--.","--.-",".-.","...","-","..-",
                          "...-",".--","-..-","-.--","--.."};
        String[] morseArr = letter.split(" ");
        for(int i = 0; i < morseArr.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(morseArr[i].equals(morse[j])) {
                    answer += Character.toString(j + 97);
                }
            }
        }
        return answer;
    }
}