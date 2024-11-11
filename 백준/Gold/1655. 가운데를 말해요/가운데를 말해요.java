import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(br.readLine());
            if(maxHeap.isEmpty() || num<=maxHeap.peek()) maxHeap.offer(num);
            else minHeap.offer(num);
            if(maxHeap.size()>minHeap.size()+1) minHeap.offer(maxHeap.poll());
            if(minHeap.size()>maxHeap.size()) maxHeap.offer(minHeap.poll());
            sb.append(maxHeap.peek()).append("\n");
        }

        System.out.println(sb);
    }
}