import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T= Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            ArrayList<Character> list = new ArrayList<>();
            bfs(A,B,list);
            for(char n : list)
                System.out.print(n);
            System.out.println();
        }

    }
    public static void bfs(int A, int B,ArrayList<Character> list){
        Queue<Integer> queue= new LinkedList<>();
        boolean[] visited = new boolean[10000];
        queue.offer(A);
        visited[A]=true;
        int[] prev=new int[10000];
        char[] prevCommand=new char[10000];
        while(!queue.isEmpty()){
            int n= queue.poll();
            if(n==B){
                for(int i=n;i!=A;i=prev[i]){
                    list.add(prevCommand[i]);
                }
                Collections.reverse(list);
                return;
            }

            int next = (n*2)%10000;
            if(!visited[next]){
                queue.offer(next);
                prev[next]=n;
                prevCommand[next]='D';
                visited[next]=true;
            }
            next=n-1;
            if(n == 0) next=9999;
            if(!visited[next]){
                queue.offer(next);
                prev[next]=n;
                prevCommand[next]='S';
                visited[next]=true;
            }
            next= (n*10 + n/1000) % 10000;
            if(!visited[next]){
                queue.offer(next);
                prev[next]=n;
                prevCommand[next]='L';
                visited[next]=true;
            }
            next= ((int)(n*0.1) + (n%10)*1000);
            if(!visited[next]){
                queue.offer(next);
                prev[next]=n;
                prevCommand[next]='R';
                visited[next]=true;
            }
        }
    }
}