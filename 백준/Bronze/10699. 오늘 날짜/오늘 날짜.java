/* 백준
 * 2022-11-28
 * https://www.acmicpc.net/problem/10699
 * Q1.서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 * 입력 : 입력은 없다.
 * 출력 : 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 * 힌트 : 채점 서버는 시간대(Timezone)는 UTC+0 이다.
   다음은 채점 서버에서 KST 시간으로 2018년 3월 21일 오후 2시 7분 38초에 date 명령어를 실행시킨 결과이다.
   Wed Mar 21 05:07:38 UTC 2018
 */
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString().substring(0, 10));
    }
}


// 풀이 방법이 많지만
// 1. 출제자의 의도대로 푼다면 Timezone을 고려해서 출력
// 2. 간단하게 오늘 날짜를 찍어서 출력해도 됨 system.out.println("2022-11-28");
// 3. 자바의 System.out.println(LocalDate.now());