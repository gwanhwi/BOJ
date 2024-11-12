import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        HashMap<Character,Integer> map = new HashMap<>();
        int maxCount=0;

        for(int i=0;i<str.length();i++){
            char c = Character.toUpperCase(str.charAt(i));
            map.put(c,map.getOrDefault(c,0)+1);
            maxCount=Math.max(maxCount,map.get(c));
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char key=entry.getKey();
            int value = entry.getValue();
            if(value==maxCount){
                sb.append(key);
            }
        }
        if(sb.length()>1)System.out.println("?");
        else System.out.println(sb);

    }
}