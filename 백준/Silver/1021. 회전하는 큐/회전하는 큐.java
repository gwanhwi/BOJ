import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i=1;i<=N;i++){
            deq.offer(i);
        }
        st = new StringTokenizer(br.readLine());
        int count=0;
        for(int i=0;i<M;i++){
            int n = Integer.parseInt(st.nextToken());
            int idx=0;
            for(int val : deq){
                if(val==n) break;
                idx++;
            }
            int left = idx;
            int right = deq.size() - idx;
            count+= Math.min(left,right);
            if(left<=right) {
                for(int j=0;j<left;j++) deq.offerLast(deq.pollFirst());
                deq.pollFirst();
            }
            else {
                for(int j=0;j<right;j++) deq.offerFirst(deq.pollLast());
                deq.pollFirst();
            }

        }
        System.out.println(count);
    }
}