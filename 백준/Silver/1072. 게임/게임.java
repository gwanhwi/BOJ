import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        long Z = (long)Y*100/X;
        if(Z==99 || Z==100){
            System.out.println(-1);
            return;
        }
        long left=0;
        long right=X;
        long mid=0;
        while(left<=right){
            mid = (left+right)/2;
            if(((Y+mid)*100)/(X+mid) >=Z+1) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(left);
    }
}