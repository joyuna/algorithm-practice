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

    