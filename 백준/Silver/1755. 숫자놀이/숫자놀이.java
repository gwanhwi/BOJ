import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for(int i=M;i<=N;i++) list.add(i);
        list.sort((o1,o2)->{
            String str1 = o1/10==0? intToString(o1) : intToString(o1/10)+intToString(o1%10);
            String str2 = o2/10==0? intToString(o2) :intToString(o2/10)+intToString(o2%10);
            return str1.compareTo(str2);

        });
        for(int i=0;i<list.size();i++) {
            sb.append(list.get(i)).append(" ");
            if(i%10==9) sb.append("\n");
        }
        System.out.println(sb);
    }
    public static String intToString(int n) {
        String str="";
        switch (n) {
            case 0:
                str= "zero";
                break;
            case 1:
                str= "one";
                break;
            case 2:
                str= "two";
                break;
            case 3:
                str= "three";
                break;
            case 4:
                str= "four";
                break;
            case 5:
                str= "five";
                break;
            case 6:
                str= "six";
                break;
            case 7:
                str= "seven";
                break;
            case 8:
                str= "eight";
                break;
            case 9:
                str= "nine";
                break;
        }
        return str;
    }
}