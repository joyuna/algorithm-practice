import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        int A = Integer.parseInt(br.readLine());  // 자연수 A, B, C를 입력 받는다.
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int ABC = A * B * C; // A * B * C // 숫자 하나씩 분류해서 각 숫자의 갯수를 센다.
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
