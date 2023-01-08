import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int ABC = A * B * C; .
        String str = Integer.toString(ABC);

        int[] arr = new int[10];
        for(int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;
        }
        for(int j : arr) {
            System.out.println(j);
        }
    }
}
