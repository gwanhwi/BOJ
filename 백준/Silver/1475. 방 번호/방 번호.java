import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] arr = new int[10];
        for(int i=0;i<str.length();i++){
            int n = str.charAt(i)-'0';
            arr[n]++;
        }
        int maxVal=0;
        for(int i=0;i<10;i++){
            if(i==6 || i==9) continue;
            maxVal = Math.max(maxVal, arr[i]);
        }
        System.out.println(Math.max(maxVal,(int)Math.ceil((arr[6]+arr[9])/2.0)));
    }
}