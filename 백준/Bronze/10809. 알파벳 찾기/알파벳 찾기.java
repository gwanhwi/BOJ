import java.io.*;
import java.util.*;
public class Main {
    static int[][] memory;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i=0;i<S.length();i++) {
        	int idx = S.charAt(i)-'a';
        	if(arr[idx]>-1)continue;
        	arr[idx]=i;
        }
        for(int i: arr) sb.append(i).append(" ");
        System.out.println(sb);
    }
    
}