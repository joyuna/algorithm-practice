class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-z|A-Z]","_").split("_");
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")) {
                answer += Integer.valueOf(arr[i]);
            }
        }
        return answer;
    }
}