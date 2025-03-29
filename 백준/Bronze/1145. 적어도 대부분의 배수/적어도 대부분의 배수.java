import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int num=1;
        while (true){
            int count=0;
            for(int i=0;i<5;i++){
                if(num%arr[i] == 0 ) count++;
            }
            if(count>=3) break;
            num++;
        }
        System.out.println(num);
    }
}