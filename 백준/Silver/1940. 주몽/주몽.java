import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count=0;
        int left=0;
        int right=N-1;
        while(left<right){
            if(arr[left]+arr[right]==M) {
                count++;
                left++;
                right--;
            }
            else if(arr[left]+arr[right]>M){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(count);
    }
}