import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<L;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int n = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<L;i++){
            if(list.get(i)>n){
                int start;
                if(i-1<0) start=1;
                else start = list.get(i-1)+1;
                int end = list.get(i)-1;
                for(int j=start;j<=n;j++){
                    for(int k=j+1;k<=end;k++){
                        if(n>=j && n<=k) {
                            count++;
                        }
                    }
                }
                break;
            }
        }
        if(list.get(L-1)<n){
            int start = list.get(L-1)+1;
            int end = 1000;
            for(int j=start;j<=n;j++){
                for(int k=j+1;k<=end;k++){
                    if(n>=j && n<=k) {
                        System.out.println(j+" "+k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}