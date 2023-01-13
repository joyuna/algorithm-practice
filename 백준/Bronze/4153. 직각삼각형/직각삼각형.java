import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];


        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            Arrays.sort(arr);

            int a = (int)Math.pow(arr[0], 2);
            int b = (int)Math.pow(arr[1], 2);
            int c = (int)Math.pow(arr[2], 2);
            if(c == a + b) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}