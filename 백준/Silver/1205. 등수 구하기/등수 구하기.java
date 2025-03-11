import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        if(N!=0) st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            int score = Integer.parseInt(st.nextToken());
            map.put(score, map.getOrDefault(score,0)+1);
        }

        int rank=1;
        for(int key : map.keySet()){
            if(newScore >= key){
                break;
            } else{
                rank+=map.get(key);
            }
        }
        if(rank + map.getOrDefault(newScore,0) > P) rank=-1;

        System.out.println(rank);
    }
}