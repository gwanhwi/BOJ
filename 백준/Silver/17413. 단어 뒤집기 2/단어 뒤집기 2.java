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
        //StringTokenizer st = new StringTokenizer(br.readLine());
        String str= br.readLine();
        boolean isTag=false;
        String answer="";
        String tmp="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='<'){
                for(int j=tmp.length()-1;j>=0;j--){
                    answer+=tmp.charAt(j);
                }
                answer+=c;
                tmp="";
                isTag=true;
                continue;
            }
            if(c=='>'){
                answer+=c;
                isTag=false;
                continue;
            }
            if(isTag){
                answer+=c;
                continue;
            }
            if(c==' '){
                for(int j=tmp.length()-1;j>=0;j--){
                    answer+=tmp.charAt(j);
                }
                answer+=c;
                tmp="";
                continue;
            }
            tmp+=c;

            if(i==str.length()-1){
                for(int j=tmp.length()-1;j>=0;j--){
                    answer+=tmp.charAt(j);
                }
            }
        }
        System.out.println(answer);
    }
}
