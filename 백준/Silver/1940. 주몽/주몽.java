import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int M;
    static int count=0;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        combination(0,0,0);
        System.out.println(count);
    }
    public static void combination(int start,int depth,int sum){
        if(depth==2){
            if(sum==M){
                count++;
            }
            return;

        }
        for(int i=start;i<N;i++){
            combination(i+1,depth+1,sum+arr[i]);
        }
    }
}