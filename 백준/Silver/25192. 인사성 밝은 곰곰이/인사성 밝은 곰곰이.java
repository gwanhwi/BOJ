import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int answer=0;
        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.equals("ENTER")) {
                answer+=map.size();
                map.clear();
                continue;
            }
            map.put(str,map.getOrDefault(str,0)+1);
        }
        answer+=map.size();
        System.out.println(answer);
    }
}