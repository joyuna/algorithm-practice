import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int count = 0;
        boolean b;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        for (int i = 0; i < 10; i++) {
            b  = false;
            for(int j = i + 1; j <arr.length; j++) {
                if(arr[i] == arr[j]) {
                    b = true;
                    break;
                }
            }
            if(b == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}