import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();

        int alarmH = 0;
        int alarmM = 0;

        if(M < 45) {
            if(H < 1) {
                alarmH = 24 + (H - 1);
                alarmM = 60 + (M - 45);
            } else {
                alarmH = H - 1;
                alarmM = 60 + (M - 45);
            }
        } else {
            alarmH = H;
            alarmM = M - 45;
        }
        System.out.print(alarmH + " ");
        System.out.print(alarmM);
    }
}