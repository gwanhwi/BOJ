import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] S= new int[N];
        Map<Integer,Integer> map = new HashMap<>();
        int[] fruits=new int[10];
        int type=0;
        int left=0;
        int max=0;
        for(int i=0;i<N;i++){
            S[i] = Integer.parseInt(st.nextToken());
            if(fruits[S[i]]++==0) {
                type++;
            }
            while(type>2){
                if(--fruits[S[left]]==0) type--;
                left++;
            }
            max=Math.max(max, i-left+1);
        }

        System.out.println(max);
    }
}