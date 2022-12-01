import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
        
        br.close();
        
    }
}


// if 문으로 조건문을 나타내도 되지만
// 삼항연산자를 사용하게 되면 조건문 길이를 줄일 수 있다.
// => System.out.println((A > B) ? ">" : ((A < B) ? "<" : "=="))
// 코멘트내에서 삼항연산자를 중첩으로 사용해서 코드를 추가해봤다.