import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        int[] arr = new int[N-1];
        for(int i=0;i<N-1;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count=0;
        while (true) {
            Arrays.sort(arr);
            boolean isFinish=true;
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>= dasom){
                    dasom++;
                    arr[i]--;
                    count++;
                    isFinish=false;
                    break;
                }
            }
            if(isFinish) break;
        }

        System.out.println(count);
    }
}