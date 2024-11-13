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
        String[] croaAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int count=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(i+1<str.length() && (c=='c' || c=='d'||c=='l' || c=='n' || c=='s' || c=='z')){
                String tmp = ""+c+str.charAt(i+1);
                if(tmp.equals("dz") && i+2<str.length()) tmp+=str.charAt(i+2);
                for(int j=0;j<croaAlpha.length;j++){
                    if(tmp.equals(croaAlpha[j])){
                        count++;
                        i+=tmp.length()-1;
                        break;
                    }
                    if(j==croaAlpha.length-1) count++;
                }
            }
            else count++;
        }
        System.out.println(count);

    }
}
