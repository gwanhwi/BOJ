import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                if(str.charAt(j)=='X'){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        System.out.println(Math.max(N-rowSet.size(),M-colSet.size()));
    }
}