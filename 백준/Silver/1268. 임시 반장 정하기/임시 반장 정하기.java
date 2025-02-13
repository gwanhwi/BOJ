import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][5];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxFriends=-1;
        int studentNum=-1;
        for(int i=0;i<N;i++){
            int friends=0;
            for(int k=0;k<N;k++){
                if(k==i) continue;
                for(int j=0;j<5;j++){
                    if(arr[i][j] == arr[k][j]) {
                        friends++;
                        break;
                    }
                }
            }
            if(friends>maxFriends){
                maxFriends=friends;
                studentNum=i+1;
            }
        }
        System.out.println(studentNum);
    }
}