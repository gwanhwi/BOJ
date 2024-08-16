import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[360];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= b; j++) {
                arr[a]++;
                arr[(a + j) % 360]++;
                if ((a - j) < 0) {
                    arr[360 - (j - a)]++;
                } else {
                    arr[a - j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<360;i++){
            if(arr[i]>0)
                count++;
        }
        System.out.println(count);
    }
}