import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static int m;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Boolean[][] arr = new Boolean[n][m];
            for(int j=0;j<n;j++) {
                Arrays.fill(arr[j],false);
            }
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int col = Integer.parseInt(st.nextToken());
                int row = Integer.parseInt(st.nextToken());
                arr[row][col] = true;
            }
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) {
                    if (arr[a][b]) {
                        search(arr, a, b);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void search(Boolean[][] arr, int row, int col) {
        if (arr[row][col]) {
            arr[row][col] = false;
            //상
            if (row - 1 >= 0) search(arr, row - 1, col);
            //하
            if (row + 1 < n) search(arr, row + 1, col);
            //좌
            if (col - 1 >= 0) search(arr, row, col - 1);
            //우
            if (col + 1 < m) search(arr, row, col + 1);
        }
    }
}