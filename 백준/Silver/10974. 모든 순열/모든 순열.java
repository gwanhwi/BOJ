import java.io.*;
import java.util.*;
public class Main {
    static StringBuilder sb;
    static int[] nums;
    static boolean[] visited;
    static int N;
    static List<Integer> list;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        visited=new boolean[N];
        for(int i=0;i<N;i++) nums[i]=i+1;
        list=new ArrayList<>();
        permutation(0);
        System.out.println(sb);
    }
    public static void permutation(int depth){
        if(depth==N){
            for(int i=0;i<N;i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(!visited[i]){
                list.add(nums[i]);
                visited[i]=true;
                permutation(depth+1);
                visited[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}
