import java.io.*;
import java.util.*;
public class Main {
    static int[] nums;
    static boolean[] visited;
    static int k;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k==0) break;
            nums=new int[k];
            visited = new boolean[k];
            for(int i=0;i<k;i++){
                nums[i]=Integer.parseInt(st.nextToken());
            }
            combination(0, 0);
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
    public static void combination(int start, int depth){
        if(depth==6) {
            for(int i=0;i<k;i++){
                if(visited[i]) sb.append(nums[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start;i<k;i++){
            visited[i]=true;
            combination(i+1, depth+1);
            visited[i]=false;
        }
    }
}
