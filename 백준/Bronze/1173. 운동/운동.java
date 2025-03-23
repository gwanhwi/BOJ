import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int exerciseTime=0;
        int time=0;
        int X=m;
        if(m+T>M){
            time=-1;
            exerciseTime=N;
        }
        while(exerciseTime < N){
            if(X+T <=M) {
                X+=T;
                exerciseTime++;
            }
            else{
                X-=R;
                if(X<m) X=m;
            }
            time++;
        }
        System.out.println(time);
    }
}