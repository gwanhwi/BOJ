import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int sumUnderFloor(int[][] arr, int k, int n){
        int sum=0;
        for(int i=1;i<n+1;i++){
            sum+=arr[k-1][i];
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int count=0;
        while(count!=testcase){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            int[][] arr = new int[k+1][n+1];
            int num=1;
            for(int i=1;i<n+1;i++){
                arr[0][i]=num;
                num++;
            }
            for(int i=1;i<k+1;i++){
                for(int j=1;j<n+1;j++){
                    arr[i][j]= sumUnderFloor(arr,i,j);
                }
            }
            /*
            arr[1][1]=arr[0][1];
            arr[1][2]=arr[0][1]+arr[0][2];
            arr[1][3]=arr[0][1]+arr[0][2]+arr[0][3];
            arr[2][1]=arr[1][1];
            arr[2][2]=arr[1][1]+arr[1][2];
            */
            System.out.println(arr[k][n]);
            count++;
        }
    }
}