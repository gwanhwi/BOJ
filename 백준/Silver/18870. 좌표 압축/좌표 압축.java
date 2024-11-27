import java.io.*;
import java.sql.Array;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] X = new int[N];
        int[] sortedX = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            X[i]=Integer.parseInt(st.nextToken());
            sortedX[i]=X[i];
        }
        Arrays.sort(sortedX);
        int index=0;
        for(int i=0;i<N;i++){
            if(map.containsKey(sortedX[i])) continue;
                map.put(sortedX[i],index++);
        }
        for(int i=0;i<N;i++){
            sb.append(map.get(X[i])).append(" ");
        }
        System.out.println(sb);
    }
}