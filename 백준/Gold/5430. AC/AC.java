import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String p=br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),",[]");
            boolean isError=false;
            int[] arr = new int[n];
            int endIdx=n-1;
            int startIdx=0;
            boolean isReverse=false;
            for(int j=0;j<n;j++){
                arr[j]=(Integer.parseInt(st.nextToken()));
            }
            for(char c : p.toCharArray()){
                if(c=='R'){
                    isReverse = !isReverse;
                }
                else if(c=='D') {
                    if(endIdx<0 || startIdx>=n) {
                        isError=true;
                        break;
                    }
                    if(isReverse) endIdx--;
                    else startIdx++;
                }
            }

            if(isError) sb.append("error").append("\n");
            else {
                sb.append("[");
                if(isReverse){
                    for(int j=endIdx;j>=startIdx;j--){
                        sb.append(arr[j]);
                        if(j>startIdx) sb.append(",");
                    }
                }
                else{
                    for(int j=startIdx;j<=endIdx;j++){
                        sb.append(arr[j]);
                        if(j<endIdx) sb.append(",");
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb);
    }
}
