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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            String s = br.readLine();
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(int i=0;i<M;i++){
            String testStr=br.readLine();
            count+=map.getOrDefault(testStr,0);
        }

        System.out.println(count);
    }
}
