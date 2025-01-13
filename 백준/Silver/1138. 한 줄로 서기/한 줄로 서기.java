import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        List<Integer> list = new ArrayList<>();
        for(int i=N;i>=1;i--){
            int count = arr[i];
            for(int j=0;j<list.size();j++){
                if(list.get(j)>i)count--;
                if(count<0) {
                    list.add(j,i);
                    break;
                }
            }
            if(count>=0){
                list.add(i);
            }
        }
        for(int num : list) sb.append(num).append(" ");
        System.out.println(sb);
    }
}
