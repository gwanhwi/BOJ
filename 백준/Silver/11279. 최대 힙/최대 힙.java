import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty()) sb.append(0);
                else sb.append(pq.poll());
                sb.append("\n");
            }
            if(x>0){
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}