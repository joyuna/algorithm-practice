import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        int ascending = 0;
        int descending = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(i + 1 == arr[i]) {
                ascending++;
            } else if(8 - i == arr[i]) {
                descending++;
            }
        }
        if(ascending == 8) {
            bw.write("ascending");
        } else if(descending == 8) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }
        br.close();
        bw.close();
    }
}