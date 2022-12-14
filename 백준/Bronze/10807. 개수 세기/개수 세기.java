import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int j = 0;
        for(int i = 0; i<n; i++) {
            if(Integer.parseInt(st.nextToken()) == m) {
                j += 1;
            }
        }
        br.close();
        bw.write(Integer.toString(j));
        bw.flush();
        bw.close();
    }
}