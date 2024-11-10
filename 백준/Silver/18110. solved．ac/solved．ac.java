import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int cutNum = (int)Math.round(n*0.15);
        int sum=0;
        for(int i=cutNum;i<n-cutNum;i++){
            sum+=arr[i];
        }
        System.out.println((int)Math.round((double)sum/(n-2*cutNum)));
    }
}