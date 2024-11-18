import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(br.readLine());
        //1과 2를 적절히 더해서 n을 만드는 경우의수 문제다. n-1의 개수 + n-2의 개수
        int[] arr = new int[N+1];
        arr[0]=1;
        arr[1]=1;
        if(N>=2) {
            for (int i = 2; i < N+1; i++) {
                arr[i] = (arr[i - 1]+ arr[i - 2])%15746;
            }
        }

        System.out.println(arr[N]);
    }
}
