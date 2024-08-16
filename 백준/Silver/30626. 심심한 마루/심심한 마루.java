import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr=new boolean[360];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= b; j++) {
                arr[a]=true;
                arr[(a + j) % 360]=true;
                if ((a - j) < 0) {
                    arr[360 - (j - a)]=true;
                } else {
                    arr[a - j]=true;
                }
            }
        }
        int count=0;
        for(int i=0;i<360;i++){
            if(arr[i])
                count++;
        }
        System.out.println(count);
    }
}