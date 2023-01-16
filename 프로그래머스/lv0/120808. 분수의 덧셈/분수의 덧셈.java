class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        
        int numerator = (denom2 * numer1) + (denom1 * numer2);
        int denominator = denom1 * denom2;
        
        int GCD = gcd(numerator, denominator);
        
        answer[0] = numerator / GCD;
        answer[1] = denominator / GCD;
            
        return answer;
    }
    static int gcd(int numerator, int denominator) {
        if(numerator % denominator == 0) {
            return denominator;
        }
        return gcd(denominator, numerator % denominator);
    }
}