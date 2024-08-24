import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        check=new boolean[n+1];
        combination(n,m,"");
    }
    static void combination(int n, int m,String str){
        if(m==0){
            System.out.println(str);
            return;
        }
        for(int i=1;i<=n;i++){
            if(check[i]==false){
                check[i]=true;
                combination(n,m-1,str+i+" ");
                check[i]=false;
            }
        }
    }
}