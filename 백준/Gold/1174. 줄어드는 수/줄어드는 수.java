import java.io.*;
import java.util.*;

class Main {
    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<=9;i++) dfs(i,i);
        Collections.sort(list);
        if(N>list.size()) sb.append(-1);
        else sb.append(list.get(N-1));
        System.out.println(sb);
    }
    public static void dfs(long num, int frontNum){
        list.add(num);
        for(int i=0;i<frontNum;i++){
            dfs(10*num+i,i);
        }
    }
}