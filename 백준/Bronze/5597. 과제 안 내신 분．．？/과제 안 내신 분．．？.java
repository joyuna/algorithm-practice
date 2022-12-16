import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Student = new int[31];

        for (int i = 1; i <= 28; i++) {
            Student[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i <= 30; i++) {
            if (Student[i] == 0) {
                System.out.println(i);
            }
        }
        br.close();
    }
}