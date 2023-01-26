class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price < 100000) {
            answer = price;
        } else if(price < 300000) {
            answer = (int)(price * 0.95);
        } else if(price < 500000) {
            answer = (int)(price * 0.90);
        } else if(price <= 1000000) {
            answer = (int)(price * 0.80);
        }
        return answer;
    }
}