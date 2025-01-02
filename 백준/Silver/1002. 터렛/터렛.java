import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int r1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int r2=Integer.parseInt(st.nextToken());
            if(x1==x2 && y1==y2 && r1==r2){
                sb.append(-1).append("\n");
                continue;
            }
            double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            if(distance >r1+r2 || distance < Math.abs(r1-r2)) sb.append(0).append("\n");
            else if(distance == r1+r2 || distance == Math.abs(r1-r2)) sb.append(1).append("\n");
            else sb.append(2).append("\n");
        }
        System.out.println(sb);
    }
}