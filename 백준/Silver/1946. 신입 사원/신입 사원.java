import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0]=Integer.parseInt(st.nextToken());
                arr[j][1]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, (o1, o2) -> o1[0]-o2[0]);
            int count=1;
            int minVal=arr[0][1];
            for(int j=1;j<N;j++){
                if(arr[j][1]<minVal){
                    count++;
                }
                minVal=Math.min(arr[j][1],minVal);

            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}