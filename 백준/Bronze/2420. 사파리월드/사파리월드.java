import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        System.out.println(Math.abs(n-m));
        
    }
}


// N과 M의 절대값을 구하는 문제
// N과 M의 계산 결과 값이 int의 범위를 벗어나기 때문에 long 타입을 사용해야함
// Math.abs() 함수를 이용해서 절대값을 구할 수 있다.