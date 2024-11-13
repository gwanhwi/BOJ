import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," <>",true);
        boolean isTag=false;
        String tmp="";
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals("<")){
                isTag=true;
                sb.append(str);
                continue;
            }
            if(str.equals(">")){
                isTag=false;
                sb.append(str);
                continue;
            }
            if(isTag){
                sb.append(str);
                continue;
            }
            if(str.equals(" ")){
                sb.append(str);
                continue;
            }
            for(int i=str.length()-1;i>=0;i--){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
