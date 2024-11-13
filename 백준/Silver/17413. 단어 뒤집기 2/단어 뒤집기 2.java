import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," <>",true);
        boolean isTag=false;
        String answer="";
        String tmp="";
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals("<")){
                isTag=true;
                answer+=str;
                continue;
            }
            if(str.equals(">")){
                isTag=false;
                answer+=str;
                continue;
            }
            if(isTag){
                answer+=str;
                continue;
            }
            if(str.equals(" ")){
                answer+=str;
                continue;
            }
            for(int i=str.length()-1;i>=0;i--){
                answer+=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
