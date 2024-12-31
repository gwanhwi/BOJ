import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<8;i++){
            int n =Integer.parseInt(br.readLine());
            list.add(n);
            map.put(n,i+1);
        }
        Collections.sort(list,Collections.reverseOrder());
        int sum=0;
        
        for(int i=0;i<5;i++) {
            sum+=list.get(i);
            list2.add(map.get(list.get(i)));
        }
        Collections.sort(list2);
        sb.append(sum).append("\n");
        for(int i=0;i<5;i++) sb.append(list2.get(i)).append(" ");

        System.out.println(sb);
    }
}
