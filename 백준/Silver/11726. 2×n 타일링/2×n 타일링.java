import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        //1과 2를 사용해 n을 만드는 개수가 정답임
        //5= 4만드는 개수 + 3만드는 개수
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=(arr[i-1]+arr[i-2])%10007;
        }
        System.out.println(arr[n]);
    }
}
