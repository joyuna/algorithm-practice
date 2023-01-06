import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int j = 0; j < N; j++) {
            if (A[j] > max) max = A[j];
                sum = sum + A[j];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}