import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Long> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) list.add(Long.parseLong(st.nextToken()));
        for(int i=0;i<m;i++){
            Collections.sort(list);
            long sum = list.get(0)+list.get(1);
            list.remove(0);
            list.remove(0);
            list.add(sum);
            list.add(sum);
        }
        long sum=0;
        for(long num : list) sum+=num;
        System.out.println(sum);
    }
}
