import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> dq = new ArrayDeque<>();
        for(int i=0;i<N;i++){
            dq.add(new int[] {i+1, Integer.parseInt(st.nextToken())});
        }
        int[] pick = dq.pollFirst();
        sb.append(pick[0]).append(" ");
        int val=pick[1];
        while(!dq.isEmpty()){
            if(val>0){
                for(int j=0;j<val-1;j++){
                    dq.offerLast(dq.pollFirst());
                }
            }
            else{
                for(int j=0;j<val*-1;j++){
                    dq.offerFirst(dq.pollLast());
                }
            }
            pick=dq.pollFirst();
            sb.append(pick[0]).append(" ");
            val=pick[1];
        }
        System.out.println(sb);
    }
}