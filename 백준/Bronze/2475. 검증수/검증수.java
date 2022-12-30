import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for(int i = 0; i < 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            result += Math.pow(n, 2);
        }
        System.out.println(result % 10);
        br.close();
    }
}

/*
java.lang.Math클래스의 pow() 메소드 활용

=> Math.pow(밑, 지수)
 */