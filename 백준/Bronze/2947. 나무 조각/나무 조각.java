import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0;i<5;i++) arr[i] = Integer.parseInt(st.nextToken());
        while (true) {
            boolean isFinish = true;
            for(int i=0;i<4;i++){
                if(arr[i]>arr[i+1]) {
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    printArr(arr,sb);
                }
            }
            for(int i=0;i<5;i++){
                if(arr[i]!=i+1) isFinish=false;
            }
            if(isFinish) break;
        }
        System.out.println(sb);
    }
    public static void printArr (int[] arr, StringBuilder sb) {
        for(int i=0;i<arr.length;i++) sb.append(arr[i]).append(" ");
        sb.append("\n");
    }
}