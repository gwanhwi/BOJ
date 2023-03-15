import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int[] cnt=new int[n];
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); //kg
            arr[i][1] = Integer.parseInt(st.nextToken()); //cm
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1])
                    cnt[i]++;
            }
        }
        for(int i=0;i<n;i++){
            sb.append(++cnt[i]).append(" ");
        }
        System.out.println(sb);
    }
}
