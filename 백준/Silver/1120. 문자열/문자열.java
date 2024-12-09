import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int minCount=Integer.MAX_VALUE;
        for(int i=0;i<B.length()-A.length()+1;i++){
            int count=0;
            for(int j=0;j<A.length();j++){
                if(A.charAt(j) != B.charAt(i+j)) count++;
            }
            minCount=Math.min(minCount,count);
        }
        System.out.println(minCount);
    }
}