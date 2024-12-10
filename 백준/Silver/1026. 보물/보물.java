import java.io.*;
import java.util.*;

class Main {
    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int S=0;
        for(int i=0;i<N;i++){
            S+=A[i]*B[N-i-1];
        }
        System.out.println(S);
    }
}