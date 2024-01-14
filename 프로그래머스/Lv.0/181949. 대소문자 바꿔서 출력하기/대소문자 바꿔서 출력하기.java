import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(char i : a.toCharArray()) {
            if(Character.isLowerCase(i)) {
                result += Character.toUpperCase(i);
            } else {
                result += Character.toLowerCase(i);
            }
        }
        
        System.out.print(result);
    }
}