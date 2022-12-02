import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int leapYear = Integer.parseInt(br.readLine());

        if(leapYear % 4 == 0) {
            if(leapYear % 400 == 0) {
                System.out.println("1");
            } else if(leapYear % 100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }} else {
            System.out.println("0");
        }
    }
}