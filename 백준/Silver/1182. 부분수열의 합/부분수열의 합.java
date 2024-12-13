import java.io.*;
import java.util.*;

class Main {
    static int[] arr;
    static int N;
    static int S;
    static int count=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        combination(0,0,0);
        System.out.println(count);
    }
    public static void combination(int start, int depth, int sum){
        if(sum==S && depth>0){ //공집합 제외
            count++;
        }
        //if(depth==N) return;
        for(int i=start;i<N;i++){
            combination(i+1,depth+1, sum+arr[i]);
        }
    }
}