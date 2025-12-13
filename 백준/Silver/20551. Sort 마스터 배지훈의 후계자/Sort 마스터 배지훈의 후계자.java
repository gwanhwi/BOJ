import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int D = Integer.parseInt(br.readLine().trim());
            int idx = lowerBound(arr, D);
            if (idx < N && arr[idx] == D) sb.append(idx).append('\n');
            else sb.append(-1).append('\n');
        }

        System.out.print(sb.toString());
    }

    static int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] >= target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
