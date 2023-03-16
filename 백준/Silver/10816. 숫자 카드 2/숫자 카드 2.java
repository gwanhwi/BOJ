import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = Integer.parseInt(st.nextToken());
            if(map.containsKey(key))
                map.put(key,map.get(key)+1);
            else
                map.put(key, 1);
        }
        int m=Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for(int j=0;j<m;j++){
            int num=Integer.parseInt(st.nextToken());
            int count;
            if(map.containsKey(num))
                count = map.get(num);
            else count=0;
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
