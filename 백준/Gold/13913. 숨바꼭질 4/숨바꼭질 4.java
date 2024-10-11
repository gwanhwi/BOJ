import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list= bfs(N,K);
        System.out.println(list.size()-1);
        for(int n : list){
            System.out.print(n+" ");
        }

    }
    public static ArrayList<Integer> bfs(int N, int K){
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited=new boolean[100001];
        int[] prev = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N]=true;
        while(!queue.isEmpty()){
            int n = queue.poll();

            if(n==K){
                for(int i=n;i!=N;i=prev[i]){
                    list.add(i);
                }
                list.add(N);
                Collections.reverse(list);
                return list;
            }
            int[] move = {n-1, n+1, n*2};
            for(int i=0;i<move.length;i++){
                int next = move[i];
                if(next>=0 && next<=100000 && !visited[next]){
                    queue.offer(next);
                    visited[next]=true;
                    prev[next]=n;
                }
            }

        }
        return null;
    }
}