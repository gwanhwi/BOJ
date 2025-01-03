import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int n = Integer.parseInt(st.nextToken());
            map.put(n,1);
        }
        int M = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int n=Integer.parseInt(st.nextToken());
            if(map.containsKey(n)) sb.append(1);
            else sb.append(0);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}