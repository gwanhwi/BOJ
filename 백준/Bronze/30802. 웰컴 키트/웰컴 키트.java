import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size= new int[6];
        for(int i=0;i<6;i++){
            size[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T= Integer.parseInt(st.nextToken());
        int P= Integer.parseInt(st.nextToken());

        int TSize=0;
        for(int i=0;i<6;i++){
            TSize+= (int)Math.ceil((double)size[i]/T);
        }
        System.out.println(TSize);
        System.out.println(N/P+" "+N%P);
    }

}