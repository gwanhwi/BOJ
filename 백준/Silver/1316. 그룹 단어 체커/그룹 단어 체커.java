import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<N;i++){
            int[] arr = new int['z'-'a'+1];
            boolean isGroupWord=true;
            String str=br.readLine();
            arr[str.charAt(0)-'a']++;
            for(int j=1;j<str.length();j++){
                int c = str.charAt(j);
                if(str.charAt(j-1)!=str.charAt(j)){
                    if(arr[str.charAt(j)-'a']>0) {
                        isGroupWord=false;
                        break;
                    }
                }
                arr[str.charAt(j)-'a']++;
            }
            if(isGroupWord) count++;
        }
        System.out.println(count);

    }
}