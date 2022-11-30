/* 백준
 * 2022-07-12
 * https://www.acmicpc.net/problem/9498
 * Q1.시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력: 시험 성적을 출력한다.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int grade = 0;
        Scanner keyScan = new Scanner(System.in);
        System.out.println("시험 점수를 입력하세요.");
        grade = keyScan.nextInt();

        if (grade < 0 || grade > 100) {
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");

            keyScan.close();

        }
    }
}

