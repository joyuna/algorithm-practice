import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int grade = 0;
        Scanner keyScan = new Scanner(System.in);
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

// System.out.println("시험 점수를 입력하세요.");
// 이런 문구가 들어가면 백준 채점에서 탈락함 ..ㅎ