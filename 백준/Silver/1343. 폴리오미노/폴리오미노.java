import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        List<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c =='.'){
                if(count>0){
                    list.add(count);
                    count=0;
                }
                list.add(-1);
            }
            if(c == 'X') count++;
        }
        if(count>0) list.add(count);
        for(int val : list){
            if(val==-1) sb.append(".");
            if(val%2==1) {
                sb.delete(0,sb.length());
                sb.append("-1");
                break;
            }
            for(int i=0;i<val/4;i++){
                sb.append("AAAA");
            }
            for(int i=0;i<val%4;i++){
                sb.append("B");
            }
        }

        System.out.println(sb);
    }
}