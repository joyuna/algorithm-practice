import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        System.out.println(A * B);

    }
}


// 해당 문제에선 3번을 선택해서 풀이함.
// 입력하는 방법을 살펴보자.
// 1. 가장 기본적인 입력 방법인 Scanner 사용
//      => 속도가 느리다.
//          why? 리소스를 많이 사용해 성능 부하를 초래하기 때문
//      => 입력을 다 받고 난 뒤 Scanner를 .close()로 스트림을 종료해주면 좋다.(리소스 낭비 막기 위해)
// 2. BufferedReader 사용 + StringTokenizer 클래스로 문자열 분리
//      BufferedReader 특징
//      => 속도가 빠르다.
//          why? 버퍼에 저장해두었다가 한번에 입력하는 방식 때문
//          (필수적이진 않지만 사용이 끝나면 .close()로 스트림을 종료해주면 좋다.)
//      => String의 형태로만 입출력이 가능
// 3. BufferedReader 사용 + split() 으로 문자열 분리