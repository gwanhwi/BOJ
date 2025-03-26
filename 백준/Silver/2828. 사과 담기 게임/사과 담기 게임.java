import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());
        int[] arr = new int[J];
        for(int i=0;i<J;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int bucketStartPosition=1;
        int moveDistance=0;
        for(int i=0;i<arr.length;i++){
            int dropPosition = arr[i];
            int bucketEndPosition = bucketStartPosition+M-1;
            if(dropPosition<bucketStartPosition){
                moveDistance += bucketStartPosition-dropPosition;
                bucketStartPosition=dropPosition;
            }
            if(dropPosition > bucketEndPosition){
                moveDistance += dropPosition - bucketEndPosition;
                bucketEndPosition = dropPosition;
                bucketStartPosition = bucketEndPosition - M +1;
            }
        }
        System.out.println(moveDistance);
    }
}