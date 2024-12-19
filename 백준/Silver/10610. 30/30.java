import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int sum=0;
        int[] arr = new int[10];
        for(int i=0;i<N.length();i++){
            int n =Integer.parseInt(Character.toString(N.charAt(i)));
            sum+=n;
            arr[n]++;
        }

        if(arr[0]==0) sb.append(-1);
        else{
            if(sum%3==0) {
                for(int i=9;i>=0;i--){
                    while(arr[i]>0){
                        sb.append(i);
                        arr[i]--;
                    }
                }
            }
            else sb.append(-1);
        }

        System.out.println(sb);
    }
}