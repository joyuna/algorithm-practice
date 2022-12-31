import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += br.read() - '0';
        }
        System.out.println(sum);
        br.close();
    }
}