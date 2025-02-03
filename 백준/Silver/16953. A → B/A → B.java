import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count=0;
        boolean isFind=false;
        while(B>0){
            if(A==B) {
                isFind=true;
                break;
            }
            if(B%2==1){
                if(B%10==1){
                    count++;
                    B=(B-1)/10;
                } else{
                    break;
                }
            } else{
                count++;
                B/=2;
            }
        }

        if(isFind) System.out.println(count+1);
        else System.out.println(-1);
    }
}