import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        int i = 1;
        while (i <= n) {
            i++;
            System.out.print(str);
        }
    }
}