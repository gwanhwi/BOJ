import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String answer="";
        for(int i=0;i<N;i++){
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            if(answer=="") answer = str;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == answer.charAt(j)){
                    sb.append(str.charAt(j));
                }
                else sb.append("?");
            }
            answer = sb.toString();

        }

        System.out.print(answer);
    }
}