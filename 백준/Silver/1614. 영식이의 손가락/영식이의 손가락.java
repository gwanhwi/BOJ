import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int hurtFinger = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = {1,2,3,4,5,4,3,2};
        long answer = 0;
        if(hurtFinger==1 || hurtFinger==5){
            answer=(long)arr.length*n;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==hurtFinger) break;
                answer++;
            }
        } else{
            answer = (long)n/2*arr.length;
            int hurtCount=n/2*2;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==hurtFinger) {
                    if(++hurtCount>n) break;
                }
                answer++;
            }
        }
        System.out.println(answer);
    }
}