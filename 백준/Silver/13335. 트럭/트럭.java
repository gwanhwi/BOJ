import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            queue.offer(a[i]);
        }
        int time=0;
        int[] bridge = new int[w];
        int weightOnBridge=0;
        int truckOnBridge=0;
        while(!queue.isEmpty()){
            time++;
            if(bridge[w-1]>0){
                weightOnBridge-=bridge[w-1];
                truckOnBridge--;
                bridge[w-1]=0;
            }
            for(int i=w-1;i>0;i--){
                bridge[i]=bridge[i-1];
            }
            bridge[0]=0;
            if(weightOnBridge+queue.peek()>L) continue;
            if(truckOnBridge>w) continue;
            bridge[0]=queue.poll();
            weightOnBridge+=bridge[0];
            truckOnBridge++;
        }
        System.out.println(time+w);
    }
}
