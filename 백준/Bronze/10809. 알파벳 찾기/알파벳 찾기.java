import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(s.indexOf(c) + " ");
        }
        System.out.println(sb);
    }
}

/* ver2.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr) {
            System.out.println(var + " ");
        }
    }
}
 */