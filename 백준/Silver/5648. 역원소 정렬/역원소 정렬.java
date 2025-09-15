import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder allInput = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            allInput.append(line).append(" ");
        }
        StringTokenizer st = new StringTokenizer(allInput.toString().trim());
        
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];
        
        for (int i = 0; i < N; i++) {
            String token = st.nextToken();
            String reversed = new StringBuilder(token).reverse().toString();
            long val = Long.parseLong(reversed);
            arr[i] = val;
        }
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for (long v : arr) {
            sb.append(v).append('\n');
        }
        System.out.println(sb.toString());
    }
}