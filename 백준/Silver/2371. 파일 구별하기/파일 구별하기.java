import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] list = new List[N];
        for(int i=0;i<N;i++) list[i]=new ArrayList<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                int n = Integer.parseInt(st.nextToken());
                if(n==-1) break;
                list[i].add(n);
            }
        }

        int k=1;
        while(true){
            Set<String> set = new HashSet<>();
            boolean isUnique=true;
            for(int i=0;i<N;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<k;j++){
                    if(j < list[i].size()){
                        sb.append(list[i].get(j));
                    } else{
                        sb.append(0);
                    }
                }
                if(set.contains(sb.toString())){
                    isUnique=false;
                    break;
                } else{
                    set.add(sb.toString());
                }
            }
            if(isUnique){
                break;
            }
            k++;
        }
        System.out.println(k);
    }
}