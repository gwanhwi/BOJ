import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] edge = new int[N-1];
        int[] oilPrice = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N-1;i++){
            edge[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            oilPrice[i]=Integer.parseInt(st.nextToken());
        }
        int cheapPriceCity=Integer.MAX_VALUE;
        int answer = 0;
        for(int i=0;i<edge.length;i++){
            if(oilPrice[i]<cheapPriceCity){
                cheapPriceCity=oilPrice[i];
            }
            answer+=edge[i]*cheapPriceCity;
        }
        System.out.println(answer);
    }
}
